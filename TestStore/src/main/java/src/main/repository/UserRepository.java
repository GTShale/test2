package src.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import src.main.models.TestingModel;

@Repository
public interface UserRepository extends JpaRepository<TestingModel, Long> {
    TestingModel findByLogin(String login);
}