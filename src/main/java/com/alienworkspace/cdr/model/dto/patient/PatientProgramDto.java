package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Schema(
        name = "PatientProgram",
        description = "Patient Program"
)
public class PatientProgramDto extends AuditTrail {

    @Schema(
            description = "Patient Program Id",
            example = "1"
    )
    private long patientProgramId;

    @Schema(
            description = "Patient Id",
            example = "1"
    )
    private long patientId;

    @Schema(
            description = "Program Id",
            example = "1"
    )
    private Integer programId;

    @Schema(
            description = "Location Id",
            example = "1"
    )
    private Integer locationId;

    @Schema(
            description = "Date Enrolled",
            example = "2020-12-31"
    )
    private LocalDate dateEnrolled;

    @Schema(
            description = "Date Completed",
            example = "2020-12-31"
    )
    private LocalDate dateCompleted;

    @Schema(
            description = "Outcome Concept Id",
            example = "1"
    )
    private Integer outcomeConceptId;

    @Schema(
            description = "Outcome Comment",
            example = "Outcome Comment"
    )
    private String outcomeComment;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PatientProgramDto that = (PatientProgramDto) o;
        return getPatientProgramId() == that.getPatientProgramId()
                && getPatientId() == that.getPatientId()
                && Objects.equals(getProgramId(), that.getProgramId())
                && Objects.equals(getLocationId(), that.getLocationId())
                && Objects.equals(getDateEnrolled(), that.getDateEnrolled())
                && Objects.equals(getDateCompleted(), that.getDateCompleted())
                && Objects.equals(getOutcomeConceptId(), that.getOutcomeConceptId())
                && Objects.equals(getOutcomeComment(), that.getOutcomeComment())
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
        return Objects.hash(getPatientProgramId(), getPatientId(), getProgramId(), getLocationId(),
                getDateEnrolled(), getDateCompleted(), getOutcomeConceptId(), getOutcomeComment(), getCreatedAt(),
                getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
