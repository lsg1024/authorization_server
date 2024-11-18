package spring.oauth.authorization_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.oauth.authorization_server.domain.entity.RegisterEntity;

import java.util.Optional;

public interface RegisterRepository extends JpaRepository<RegisterEntity, String> {
    Optional<RegisterEntity> findByClientId(String clientId);
}
