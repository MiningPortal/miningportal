package pl.miningportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.miningportal.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}