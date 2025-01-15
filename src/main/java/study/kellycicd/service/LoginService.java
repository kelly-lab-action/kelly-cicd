package study.kellycicd.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean login(final String username, final String password) {
        return username.equals("kelly") && password.equals("kellyPw");
    }
}
