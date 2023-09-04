package com.example.jobscout.entities;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Requirements {

    @Id
    private long requirementsId;

    private String position;

    private int yearsOfExperience;

    private List<String> technologies;

    private String englishLevel;
}
