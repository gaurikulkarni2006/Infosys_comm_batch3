package com.CommUnity.app.controller;
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======

>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
import com.CommUnity.app.model.Admin;
import com.CommUnity.app.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

/**
 * AdminController handling admin-related API requests
 */
=======
import java.util.Optional;

>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
import java.util.Optional;

>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    /**
     * Sign up a new admin
     */
    @PostMapping("/signup")
    public ResponseEntity<Map<String, String>> signUpAdmin(@RequestBody Admin admin) {
        String message = adminService.saveAdmin(admin);
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
     * Sign in an existing admin
     */
    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> signInAdmin(@RequestParam String username, @RequestParam String password) {
        Map<String, String> response = new HashMap<>();
        if (adminService.authenticate(username, password).isPresent()) {
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
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.saveAdmin(admin);
        return ResponseEntity.ok(savedAdmin);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<Admin>> getAdmin(@PathVariable String username) {

        Optional<Admin> foundAdmin = adminService.findByUsername(username);

        if (foundAdmin.isPresent()) {
            return ResponseEntity.ok(foundAdmin); // HTTP 200 OK if found
        } else {
            return ResponseEntity.notFound().build(); // HTTP 404 Not Found if not found
        }
    }
}
<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
