package study.kellycicd.common.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.kellycicd.common.controller.response.ApiResponse;

@RestController
public class HealthCheckController {

    @GetMapping("/api/health-check")
    public ResponseEntity<ApiResponse<Void>> healthCheck() {
        return ResponseEntity.ok(ApiResponse.success("Dogether Backend Service is OK"));
    }
}
