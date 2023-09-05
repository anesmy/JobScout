package com.example.jobscout.entities;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    private long userId;

    private String username;

    private String email;

    private String coverLetter;
}
