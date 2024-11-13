package com.CommUnity.app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

<<<<<<< HEAD
<<<<<<< HEAD
/**
 * User class representing a resident in the community
 */
=======
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
<<<<<<< HEAD
<<<<<<< HEAD
    private String username;
    private String password;
    private String role = "RESIDENT";

    // Mandatory fields
    private String name;
    private String phoneNumber;
    private String societyName;
    private String city;
    private String district;
    private String postal;

    // Optional field
    private String flatNumber;
=======
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b

    private String username;
    private String password;
    private String role = "RESIDENT";
<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
}

