package co.ke.shiftech.demo.service;

import co.ke.shiftech.demo.NotFoundException;
import co.ke.shiftech.demo.model.User;
import co.ke.shiftech.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public Long delete(Long id) {
        try {
            User user = userRepository.findById(id).orElseThrow(() ->
                    new NotFoundException("No user record with id " + id + " found"));

            userRepository.delete(user);
            return id;
        } catch (Exception e) {
            System.out.print(Arrays.toString(e.getStackTrace()));
        }
        return null;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new NotFoundException("No user record with id " + id + " found"));
    }

    @Override
    public User update(Long id, User user) {
        User user1 = userRepository.findById(id).orElseThrow(() ->
                new NotFoundException("No user record with id " + id + " found"));

        user1.setName(user1.getName());
        user1.setEmail(user1.getEmail());
        user1.setPhoneNumber(user1.getPhoneNumber());
        user1.setUpdatedTime(new Timestamp(new Date().getTime()));

        return user;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
