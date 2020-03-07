package co.ke.shiftech.demo.service;

import co.ke.shiftech.demo.model.User;

import java.util.List;

public interface UserService {
    User create(User user);

    Long delete(Long id);

    User findById(Long id);

    User update(Long id, User user);

    List<User> findAll();
}
