package spring.oauth.authorization_server.domain.dto;

import lombok.Getter;
import lombok.Setter;
import spring.oauth.authorization_server.domain.entity.Role;

@Getter @Setter
public class UserDto {

    private String username;
    private String password;
    private String nickname;
    private String email;

}
