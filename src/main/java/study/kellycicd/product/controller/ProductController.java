package study.kellycicd.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.kellycicd.common.controller.response.ApiResponse;
import study.kellycicd.product.controller.request.CreateProductRequest;

import java.net.URI;

@RequestMapping("/api/products")
@RestController
public class ProductController {

    @PostMapping
    public ResponseEntity<ApiResponse<Void>> createProduct(@RequestBody final CreateProductRequest request) {
        return ResponseEntity.created(URI.create("/api/products/1L")).body(ApiResponse.success("상품 정보가 저장되었습니다."));
    }
}
