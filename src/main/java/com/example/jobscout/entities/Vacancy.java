package com.example.jobscout.entities;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Vacancy {

    @Id
    private long vacancyId;
}
