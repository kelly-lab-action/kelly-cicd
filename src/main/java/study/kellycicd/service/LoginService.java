package study.kellycicd.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {

    public boolean login(final String username, final String password) {
        if (username.equals("kelly") && password.equals("kellyPw")) {
            log.info("로그인 성공 : {}", username);
            return true;
        }

        log.info("로그인 실패 : {}", username);
        return false;
    }
}
