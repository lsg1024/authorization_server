package spring.oauth.authorization_server.springSecurity.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import spring.oauth.authorization_server.domain.entity.UserEntity;
import spring.oauth.authorization_server.repository.UserRepository;

public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username).orElseThrow();

        return User.builder()
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .roles(String.valueOf(userEntity.getRole()))
                .build();
    }
}
