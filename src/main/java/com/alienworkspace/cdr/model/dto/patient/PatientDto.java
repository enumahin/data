package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.dto.person.PersonAttributeDto;
import com.alienworkspace.cdr.model.dto.person.PersonDto;
import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(
    name = "Patient Dto",
        description = "Patient Dto for patient entity"
)
public class PatientDto extends AuditTrail {

    @Schema(
            description = "Patient Id",
            example = "1"
    )
    private Long patientId;
    @Schema(
            name = "Patient Allergies",
            description = "Patient Allergies",
            example = "Penicillin, Aspirin"
    )
    private String allergies;

    @Schema(
            name = "Patient Birth Date",
            description = "Patient Birth Date",
            example = "2020-12-31"
    )
    private String birthDate;

    @Schema(
            name = "Patient Death Date",
            description = "Patient Death Date",
            example = "2020-12-31"
    )
    private String deathDate;

    @Schema(
            name = "Patient Gender",
            description = "Patient Gender",
            example = "M=Male and F=Female"
    )
    private String gender;

    @Schema(
            name = "Patient Person",
            description = "Patient Person",
            example = "123456789"
    )
    private PersonDto person;

    @Schema(
            name = "Patient Identifier",
            description = "Patient Identifier",
            example = "123456789"
    )
    private String identifier;

    @Schema(
            name = "Patient Identifier Type",
            description = "Patient Identifier Type",
            example = "National ID"
    )
    private String identifierType;

    @Schema(
            name = "Patient Identifier Type Id",
            description = "Patient Identifier Type Id",
            example = "1"
    )
    private Integer identifierTypeId;

    @Schema(
            name = "Patient Identifier Dtos",
            description = "Patient Identifier Dtos",
            example = "123456789"
    )
    private List<PatientIdentifierDto> patientIdentifierDtos = new ArrayList<>();

    @Schema(
            name = "Patient Program Dtos",
            description = "Patient Program Dtos",
            example = "123456789"
    )
    private List<PatientProgramDto> patientPrograms = new ArrayList<>();

    @Schema(
            name = "Patient Attributes",
            description = "Patient Attributes",
            example = "123456789"
    )
    private List<PersonAttributeDto> patientAttributes = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PatientDto that = (PatientDto) o;
        return Objects.equals(getPatientId(), that.getPatientId())
                && Objects.equals(getAllergies(), that.getAllergies())
                && Objects.equals(getBirthDate(), that.getBirthDate())
                && Objects.equals(getDeathDate(), that.getDeathDate())
                && Objects.equals(getGender(), that.getGender())
                && Objects.equals(getPerson(), that.getPerson())
                && Objects.equals(getIdentifier(), that.getIdentifier())
                && Objects.equals(getIdentifierType(), that.getIdentifierType())
                && Objects.equals(getIdentifierTypeId(), that.getIdentifierTypeId())
                && Objects.equals(getPatientIdentifierDtos(), that.getPatientIdentifierDtos())
                && Objects.equals(getPatientPrograms(), that.getPatientPrograms())
                && Objects.equals(getPatientAttributes(), that.getPatientAttributes())
                && Objects.equals(getCreatedAt(), that.getCreatedAt())
                && Objects.equals(getCreatedBy(), that.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), that.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), that.getLastModifiedBy())
                && Objects.equals(getVoided(), that.getVoided())
                && Objects.equals(getVoidedAt(), that.getVoidedAt())
                && Objects.equals(getVoidedBy(), that.getVoidedBy())
                && Objects.equals(getVoidReason(), that.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatientId(), getAllergies(), getBirthDate(), getDeathDate(),
                getGender(), getPerson(), getIdentifier(), getIdentifierType(), getIdentifierTypeId(),
                getPatientIdentifierDtos(), getPatientPrograms(), getPatientAttributes(), getCreatedAt(),
                getCreatedBy(), getLastModifiedBy(), getLastModifiedAt(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
