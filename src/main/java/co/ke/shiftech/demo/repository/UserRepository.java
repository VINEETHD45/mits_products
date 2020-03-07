package co.ke.shiftech.demo.repository;

import co.ke.shiftech.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // This will create ,delete ,update and read
    Optional<User> findById(Long id);

    List<User> findAll();
}