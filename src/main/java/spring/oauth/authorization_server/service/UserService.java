package spring.oauth.authorization_server.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import spring.oauth.authorization_server.domain.dto.UserDto;
import spring.oauth.authorization_server.domain.entity.Role;
import spring.oauth.authorization_server.domain.entity.UserEntity;
import spring.oauth.authorization_server.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void create(UserDto dto) {

        UserEntity entity = new UserEntity();
        entity.setUsername(dto.getUsername());
        entity.setPassword(bCryptPasswordEncoder.encode(dto.getPassword()));
        entity.setNickname(dto.getNickname());
        entity.setEmail(dto.getEmail());
        entity.setRole(Role.WAIT);

        userRepository.save(entity);
    }
}
