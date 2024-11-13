package com.CommUnity.app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

<<<<<<< HEAD
<<<<<<< HEAD
/**
 * Admin class represents a community administrator
 */
=======
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
@Data
@Document(collection = "admins")
public class Admin {
    @Id
    private String id;
<<<<<<< HEAD
<<<<<<< HEAD
    private String username;
    private String password;
    private String role = "ADMIN";

    // Additional fields
    private String name;
    private String phoneNumber;
    private String societyName;
    private String flatNumber;
    private String postal;
}
=======
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b

    private String username;
    private String password;
    private String role = "ADMIN";
}

<<<<<<< HEAD
>>>>>>> d3ecb3eb8e1b2d7a9088ecd3f149955b68523ca5
=======
>>>>>>> cb304c9a42b5a687cf99c0bb45dd220e7ef5102b
