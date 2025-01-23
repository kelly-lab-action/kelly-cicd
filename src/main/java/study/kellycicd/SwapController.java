package study.kellycicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwapController {

    @GetMapping("/api/swap")
    public String swap() {
        return "Swap!!! 널 믿는댜!!!!";
    }
}
