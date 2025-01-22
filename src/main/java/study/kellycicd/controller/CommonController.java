package study.kellycicd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile("!prod")
@RequiredArgsConstructor
@RestController
public class CommonController {

    private final ResourceLoader resourceLoader;

    @Value("${secret.api-docs-path}")
    private String apiDocsPath;

    @GetMapping("/api/docs")
    public ResponseEntity<Resource> docs() {
//        final Resource resource = resourceLoader.getResource("classpath:/static/docs/index.html");
        final Resource resource = resourceLoader.getResource("classpath:" + apiDocsPath);
        return ResponseEntity.ok(resource);
    }
}