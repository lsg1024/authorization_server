package spring.oauth.authorization_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.oauth.authorization_server.domain.entity.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);
}
