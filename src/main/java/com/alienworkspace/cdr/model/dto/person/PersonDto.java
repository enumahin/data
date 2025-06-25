package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "PersonDto", description = "Person Data Transfer Object")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDto extends AuditTrail {

    @Schema(
            description = "Person Id",
            example = "1"
    )
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

    @Schema(
            description = "Is the person married?",
            example = "true/false"
    )
    @Builder.Default
    @NotNull(message = "Person Name is required")
    private Set<PersonNameDto> name = new HashSet<>();

    @Schema(
            description = "Is the person married?",
            example = "true/false"
    )
    @Builder.Default
    @NotNull(message = "Person Address is required")
    private Set<PersonAddressDto> address = new HashSet<>();

    @Schema(
            description = "Is the person married?",
            example = "true/false"
    )
    @Builder.Default
    @NotNull(message = "Person Attributes is required")
    private Set<PersonAttributeDto> attributes = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonDto personDto = (PersonDto) o;
        return Objects.equals(getPersonId(), personDto.getPersonId())
                && Objects.equals(getGender(), personDto.getGender())
                && Objects.equals(getBirthDate(), personDto.getBirthDate())
                && Objects.equals(getDead(), personDto.getDead())
                && Objects.equals(getDeathDate(), personDto.getDeathDate())
                && Objects.equals(getCauseOfDeath(), personDto.getCauseOfDeath())
                && Objects.equals(getName(), personDto.getName())
                && Objects.equals(getAddress(), personDto.getAddress())
                && Objects.equals(getAttributes(), personDto.getAttributes())
                && Objects.equals(getCreatedAt(), personDto.getCreatedAt())
                && Objects.equals(getCreatedBy(), personDto.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), personDto.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), personDto.getLastModifiedBy())
                && Objects.equals(getVoided(), personDto.getVoided())
                && Objects.equals(getVoidedAt(), personDto.getVoidedAt())
                && Objects.equals(getVoidedBy(), personDto.getVoidedBy())
                && Objects.equals(getVoidReason(), personDto.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getGender(), getBirthDate(), getDead(), getDeathDate(),
                getCauseOfDeath(), getName(), getAddress(), getAttributes(), getCreatedAt(), getCreatedBy(),
                getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
