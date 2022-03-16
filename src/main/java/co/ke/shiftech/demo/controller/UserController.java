package co.ke.shiftech.demo.controller;

import co.ke.shiftech.demo.model.User;
import co.ke.shiftech.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * -------------------------
     * add the new user here
     * -------------------------
     */
    @PostMapping
    public User create(@Valid @RequestBody User user) {
        return userService.create(user);
    }

    /**
     * -------------------------
     * Get only one specific user
     * --------------------------
     */
    @GetMapping(value = "{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }


    /**
     * --------------------
     * delete record here
     * --------------------
     */
    @DeleteMapping
    public Map<String, Object> delete(@RequestParam Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("deleted", userService.delete(id));
        return response;
    }

    /**
     * ----------------------
     * Fetch all users here
     * ----------------------
     */
    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * update user details
     */
    @PatchMapping
    public User update(Long id, @Valid @RequestBody User user) {
        return userService.update(id, user);
    }
}
