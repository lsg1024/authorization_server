package spring.oauth.authorization_server.domain.entity;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    WAIT("WAIT", "미승인 유저"),
    USER("USER", "일반 유저"),
    ADMIN("ADMIN", "관리자");

    private final String key;
    private final String title;

}
