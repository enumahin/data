package com.alienworkspace.cdr.model.dto.person;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PersonDto {

    private int personId;

    private Character gender;

    private LocalDate birthDate;

    private boolean dead;

    private LocalDate deathDate;

    private String causeOfDeath;

    private String uuid;
}
