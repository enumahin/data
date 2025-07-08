package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.dto.metadata.FacilityDto;
import com.alienworkspace.cdr.model.dto.metadata.LocationDto;
import com.alienworkspace.cdr.model.dto.person.PersonDto;
import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.*;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(
    name = "Patient Dto", description = "Patient Dto for patient entity"
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
            name = "Patient Identifier Dtos",
            description = "Patient Identifier Dtos",
            example = "123456789"
    )
    @Builder.Default
    private Set<PatientIdentifierDto> patientIdentifiers = new HashSet<>();

    @Schema(
            name = "Patient Program Dtos",
            description = "Patient Program Dtos",
            example = "123456789"
    )
    @Builder.Default
    private Set<PatientProgramDto> patientPrograms = new HashSet<>();

    @Schema(
            name = "Patient Person",
            description = "Patient Person",
            example = "123456789"
    )
    @NotNull(message = "Person cannot be null")
    private PersonDto person;

    @Schema(
            name = "Patient Facility",
            description = "Patient Facility",
            example = "General Hospital"
    )
    private FacilityDto facility;

    @Schema(
            name = "Patient Location",
            description = "Patient's Care Entry Point",
            example = "Maternity Ward"
    )
    private LocationDto location;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PatientDto that = (PatientDto) o;
        return Objects.equals(getPatientId(), that.getPatientId())
                && Objects.equals(getAllergies(), that.getAllergies())
                && Objects.equals(getPerson(), that.getPerson())
                && Objects.equals(getPatientIdentifiers(), that.getPatientIdentifiers())
                && Objects.equals(getPatientPrograms(), that.getPatientPrograms())
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
        return Objects.hash(getPatientId(), getAllergies(), getPatientIdentifiers(), getPatientPrograms(),
                getPerson(), getCreatedAt(),
                getCreatedBy(), getLastModifiedBy(), getLastModifiedAt(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
