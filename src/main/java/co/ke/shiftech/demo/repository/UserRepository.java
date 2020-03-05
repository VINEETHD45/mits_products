package co.ke.shiftech.demo.repository;

import co.ke.shiftech.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    // This will create ,delete ,update and read
    Optional<User> findById(Long id);

    Iterable<User> findAll();
}