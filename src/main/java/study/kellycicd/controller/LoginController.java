package study.kellycicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/api/login")
    public String login() {
        return "Welcome to KellyCicd";
    }

    @GetMapping("/api/logout")
    public String logout() {
        return "Goodbye!";
    }

    @GetMapping("/api/profile")
    public String profile() {
        return "I am KellyCicd";
    }

    @GetMapping("/api/kelly")
    public String kelly() {
        return "켈리? 켈리 몰라?";
    }

    @GetMapping("/api/elmo")
    public String elmo() {
        return "나는 엘모임 ㅎ";
    }
}
