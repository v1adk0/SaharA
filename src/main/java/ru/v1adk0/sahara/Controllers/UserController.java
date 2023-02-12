package ru.v1adk0.sahara.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.v1adk0.sahara.Entities.User;
import ru.v1adk0.sahara.Repositories.UserRepository;

import java.util.Optional;

@RestController("/user")
class UserController {
   private final UserRepository userRepository;
    UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("user/all")
    Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("user/{id}")
    Optional<User> findById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping("user/")
    User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("user/{id}")
    void deleteUserBuId(@PathVariable int id) {
        userRepository.deleteById(id);
    }

    @PutMapping("user/{id}")
    ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        return userRepository.existsById(id) ?
                new ResponseEntity<>(userRepository.save(user), HttpStatus.OK) :
                new ResponseEntity<>(userRepository.save(user), HttpStatus.CREATED);
    }
}
