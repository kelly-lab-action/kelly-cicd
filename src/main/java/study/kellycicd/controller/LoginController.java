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
}
