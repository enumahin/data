package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "PersonDto", description = "Person Data Transfer Object")
public class PersonDto extends AuditTrail {

    private Long personId;

    @Schema(
            description = "Age of the person",
            example = "M=Male and F=Female"
    )
    @NotNull(message = "Gender is required")
    private Character gender;

    @Schema(
            description = "Person birthdate (YYYY-MM-DD)",
            example = "2020-12-31"
    )
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    @Schema(
            description = "Is the person dead?",
            example = "true/false"
    )
    private Boolean dead;

    @Schema(
            description = "If the person is dead, what the death date? (YYYY-MM-DD)",
            example = "2020-12-31"
    )
    private LocalDate deathDate;

    @Schema(
            description = "If the person is dead, what's the cause of the death?",
            example = "2020-12-31"
    )
    private String causeOfDeath;

    private List<PersonNameDto> name = new ArrayList<>();

    private List<PersonAddressDto> address = new ArrayList<>();

    private List<PersonAttributeDto> attributes = new ArrayList<>();

}
