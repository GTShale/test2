package src.main.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import src.main.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
