package com.cybersploit.controller;

import com.cybersploit.repository.UserRepository;
import com.cybersploit.exception.UserNotFoundException;
import com.cybersploit.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* Created by Shailendra Vishwakarma */
@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    Logger log= LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser)
    {
        log.debug("User " + newUser.getName()+ " created");
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setCity(newUser.getCity());
                    user.setEmail(newUser.getEmail());
                    user.setOccupation(newUser.getOccupation());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)){
            log.debug("User "+id+" does not exist");
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        log.debug("User "+ id+" deleted");
        return  "User with id "+id+" has been deleted success.";
    }



}
