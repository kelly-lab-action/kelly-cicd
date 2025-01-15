package study.kellycicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.kellycicd.domain.Post;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

@SpringBootTest
class PostServiceTest {
    
    @Autowired
    private PostService postService;
    
    @DisplayName("게시글을 저장한다.")
    @Test        
    void create() {
        // Given
        final String title = "게시글 제목!";
        final String content = "게시글 내용!";
        final String author = "회원1";

        // When
        postService.create(title, content, author);
        
        // Then
        final Post savedPost = postService.getPosts().get(0);
        assertSoftly(softly -> {
            softly.assertThat(savedPost.getTitle()).isEqualTo(title);
            softly.assertThat(savedPost.getContent()).isEqualTo(content);
            softly.assertThat(savedPost.getAuthor()).isEqualTo(author);
        });
    }
}
