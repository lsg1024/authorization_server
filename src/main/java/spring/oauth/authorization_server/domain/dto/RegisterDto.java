package spring.oauth.authorization_server.domain.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RegisterDto {

    private String clientName;
    private String redirectUris;
    private String postLogoutRedirectUris;
    private String scopes;

}
