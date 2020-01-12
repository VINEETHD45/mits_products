package co.ke.shiftech.demo.database;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    // This will create ,delete ,update and read
}