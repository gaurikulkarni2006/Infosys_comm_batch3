package com.CommUnity.app.service;

import com.CommUnity.app.model.User;
import com.CommUnity.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.regex.Pattern;
=======
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public String saveUser(User user) {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            return "Username already exists. Please choose a different username.";
        }

        // Validate password
        if (!isValidPassword(user.getPassword())) {
            return "Password must be at least 8 characters long and include a mix of letters and numbers.";
        }

        // Ensure mandatory fields are filled
        if (user.getPhoneNumber() == null || user.getPostal() == null) {
            return "Phone number and postal code are mandatory.";
        }

        userRepository.save(user);
        return "Sign-up successful! Please sign in.";
    }

    private boolean isValidPassword(String password) {
        // Check password length and complexity (at least 8 characters, including one digit)
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";
        return Pattern.compile(passwordRegex).matcher(password).matches();
    }

    public Optional<User> authenticate(String username, String password) {
        return userRepository.findByUsername(username)
                .filter(user -> user.getPassword().equals(password));
    }
}

=======
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
