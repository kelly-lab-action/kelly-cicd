package study.kellycicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChickenController {

    @GetMapping("/api/chicken")
    public String chicken() {
        return "이건 방금 만든 real chicken! 🍗";
    }
}
