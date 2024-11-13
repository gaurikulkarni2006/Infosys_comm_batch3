package com.CommUnity.app.controller;

import com.CommUnity.app.model.User;
import com.CommUnity.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

/**
 * UserController handling user-related API requests
 */
=======
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    /**
     * Sign up a new user
     */
    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> signUpUser(@RequestBody User user) {
        String message = userService.saveUser(user);
        Map<String, String> response = new HashMap<>();
        if (message.contains("successful!")) {
            response.put("status", "success");
            response.put("message", message);
            return ResponseEntity.ok(response);
        } else {
            response.put("status", "error");
            response.put("message", message);
            return ResponseEntity.badRequest().body(response);
        }
    }

    /**
     * Sign in an existing user
     */
    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> signInUser(@RequestParam String username, @RequestParam String password) {
        Map<String, String> response = new HashMap<>();
        if (userService.authenticate(username, password).isPresent()) {
            response.put("status", "success");
            response.put("message", "Sign-in successful! Welcome back.");
            return ResponseEntity.ok(response);
        } else {
            response.put("status", "error");
            response.put("message", "Invalid username or password. Please try again.");
            return ResponseEntity.status(401).body(response);
        }
    }
}

=======
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {

        User user = userService.findByUsername(username).orElse(null);
        if (user != null) {
            return ResponseEntity.ok(user); // Return user with HTTP 200 OK
        } else {
            return ResponseEntity.notFound().build(); // Return HTTP 404 if user not found
        }
    }
}
<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
