package study.kellycicd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LoginServiceTest {
    
    @Autowired
    private LoginService loginService;
    
    @DisplayName("로그인 성공 테스트")
    @Test        
    void loginSuccess() {
        // Given
        final String userName = "kelly";
        final String password = "kellyPw";

        // When
        final boolean result = loginService.login(userName, password);

        // Then
        assertThat(result).isTrue();
    }

    @DisplayName("로그인 실패 테스트")
    @Test
    void loginFail() {
        // Given
        final String userName = "aa2";
        final String password = "aaPw2";

        // When
        final boolean result = loginService.login(userName, password);

        // Then
        assertThat(result).isFalse();
    }
}
