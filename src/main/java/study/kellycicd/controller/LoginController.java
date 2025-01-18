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

    @GetMapping("/api/good-bye")
    public String bye() {
        return "성욱쨩.. 이제.. 정말 마지막이야. 안녕.";
    }

    @GetMapping("/api/bye")
    public String real_bye() {
        return "너무 고생했어!!!!!!!!!!!";
    }

    @GetMapping("/api/chicken")
    public String chicken() {
        return "히히 개꿀맛 치킨 기모띵~";
    }

    @GetMapping("/api/end")
    public String end() {
        return "이제 제발 끝내고 자자 제발..";
    }
}
