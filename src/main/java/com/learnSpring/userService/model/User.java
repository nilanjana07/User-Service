package com.learnSpring.userService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2–50 characters")
        private String name;
    @NotBlank(message = "Email id cannot be blank")
    @Email(message = "Email must be of format abcd@email.com")
        private String email;

    @Min(value = 0, message = "Age cannot be negative")
    @Max(value = 120, message = "Age cannot be more than 120")
        private int age;

}


