package com.CommUnity.app.service;

import com.CommUnity.app.model.Admin;
import com.CommUnity.app.repository.AdminRepository;
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
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public String saveAdmin(Admin admin) {
        if (adminRepository.findByUsername(admin.getUsername()).isPresent()) {
            return "Username already exists. Please choose a different username.";
        }

        // Validate password
        if (!isValidPassword(admin.getPassword())) {
            return "Password must be at least 8 characters long.";
        }

        // Ensure mandatory fields are filled
        if (admin.getPhoneNumber() == null || admin.getPostal() == null) {
            return "Phone number and postal code are mandatory.";
        }

        adminRepository.save(admin);
        return "Sign-up successful! Please sign in.";
    }

    private boolean isValidPassword(String password) {
        // Check password length and complexity
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$";
        return Pattern.compile(passwordRegex).matcher(password).matches();
    }

    public Optional<Admin> authenticate(String username, String password) {
        return adminRepository.findByUsername(username)
                .filter(admin -> admin.getPassword().equals(password));
    }
}
=======
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Optional<Admin> findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}

<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
