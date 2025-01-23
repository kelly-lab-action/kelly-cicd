package study.kellycicd.common.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public enum CommonExceptionCode implements ExceptionCode {
    INTERNAL_SERVER_APPLICATION_EXCEPTION("IA-001", "서버 애플리케이션에 예기지 못한 예외가 발생했습니다.");

    private final String value;
    private final String message;
}
