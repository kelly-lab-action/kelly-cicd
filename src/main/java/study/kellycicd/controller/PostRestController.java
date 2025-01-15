package study.kellycicd.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import study.kellycicd.domain.Post;
import study.kellycicd.service.PostService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class PostRestController {

    private final PostService postService;

    @PostMapping("/posts")
    public String createPost(@RequestBody final CreatePostRequest request) {
        postService.create(request.title(), request.content(), request.author());
        return "게시글 생성 완료!";
    }

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/posts/debug")
    public String debug() {
        log.debug("디버깅 상황이 발생했습니다.");
        return "디버깅 상황 발생!";
    }

    @GetMapping("/posts/warn")
    public String warn() {
        log.warn("게시글 서비스에서 예의 주시할 특이 상황이 발생했습니다.");
        return "워닝 상황 발생!";
    }

    @GetMapping("/posts/error")
    public String error() {
        postService.getError();
        return "에러 상황 발생!";
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "test app spring boot service is ok! :>";
    }
}
