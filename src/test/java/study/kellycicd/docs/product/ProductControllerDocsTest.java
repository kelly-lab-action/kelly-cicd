package study.kellycicd.docs.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.restdocs.payload.JsonFieldType;
import study.kellycicd.docs.RestDocsSupport;
import study.kellycicd.product.controller.ProductController;
import study.kellycicd.product.controller.request.CreateProductRequest;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductControllerDocsTest extends RestDocsSupport {

    @Override
    protected Object initController() {
        return new ProductController();
    }

    @DisplayName("신규 상품 등록 API")
    @Test
    void createProduct() throws Exception {
        final CreateProductRequest request = new CreateProductRequest(
            "맛좋은 커피",
            100000,
            "개꿀맛 커피!!! 이거 한 잔이면 와따여 와따!");

        mockMvc.perform(
                   post("/api/products")
                       .content(objectMapper.writeValueAsString(request))
                       .contentType(MediaType.APPLICATION_JSON_VALUE)
               )
               .andDo(print())
               .andExpect(status().isCreated())
            .andDo(document("product-create",
                preprocessRequest(prettyPrint()),
                preprocessResponse(prettyPrint()),
                requestFields(
                    fieldWithPath("name")
                        .type(JsonFieldType.STRING)
                        .optional()
                        .description("상품명"),
                    fieldWithPath("price")
                        .type(JsonFieldType.NUMBER)
                        .optional()
                        .description("상품 가격"),
                    fieldWithPath("description")
                        .type(JsonFieldType.STRING)
                        .description("상품 설명")
                ),
                responseFields(
                    fieldWithPath("message")
                        .type(JsonFieldType.STRING)
                        .description("상품 정보가 저장되었습니다.")
                )));
    }
}
