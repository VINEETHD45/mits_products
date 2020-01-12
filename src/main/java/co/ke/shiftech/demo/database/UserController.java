package co.ke.shiftech.demo.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/api")
public class UserController {
    private final UserRepository userRepository;

    // get the instance of the userRepository
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /**
     * -------------------------
     * add the new user here
     * -------------------------
     */
    @PostMapping(path = "/add") // POST Accepted Here
    public @ResponseBody
    User addNewUser(@RequestParam String name
            , @RequestParam String email, @RequestParam String phoneNumber) {

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPhoneNumber(phoneNumber);
        userRepository.save(user);

        return user;
    }

    /**
     * -------------------------
     * Get only one specific user
     * --------------------------
     */
    @PostMapping(path = "/id")
    public @ResponseBody
    Optional<User> getUser(@RequestParam Integer id) {
        return userRepository.findById(id);
    }

    /**
     * ----------------------
     * Fetch all users here
     * ----------------------
     */
    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }
}
