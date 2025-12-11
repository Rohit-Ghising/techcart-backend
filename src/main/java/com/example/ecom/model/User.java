package com.example.ecom.model;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name ="users")

public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;

}
