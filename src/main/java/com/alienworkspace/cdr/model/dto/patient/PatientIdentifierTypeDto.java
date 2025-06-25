package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Schema(
        name = "PatientIdentifierType",
        description = "Patient Identifier Type"
)
public class PatientIdentifierTypeDto extends AuditTrail {

    @Schema(
            description = "Patient Identifier Type Id",
            example = "1"
    )
    private Integer patientIdentifierTypeId;

    @Schema(
            description = "Patient Identifier Type Name",
            example = "National ID"
    )
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @Schema(
            description = "Patient Identifier Type Description",
            example = "National ID"
    )
    private String description;

    @Schema(
            description = "Patient Identifier Type Format",
            example = "Number"
    )
    private String format;

    @Schema(
            description = "Patient Identifier Type Required",
            example = "true"
    )
    private boolean required;

    @Schema(
            description = "Patient Identifier Type Unique",
            example = "true"
    )
    private boolean unique;

    @Schema(
            description = "Patient Identifier Type Hint",
            example = "Alpha Numeric Characters Only"
    )
    private String formatHint;

    @Schema(
            description = "Patient Identifier Type Validator",
            example = "National ID Validator"
    )
    private String validator;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PatientIdentifierTypeDto that = (PatientIdentifierTypeDto) o;
        return isRequired() == that.isRequired()
                && isUnique() == that.isUnique()
                && Objects.equals(getPatientIdentifierTypeId(), that.getPatientIdentifierTypeId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getDescription(), that.getDescription())
                && Objects.equals(getFormat(), that.getFormat())
                && Objects.equals(getFormatHint(), that.getFormatHint())
                && Objects.equals(getValidator(), that.getValidator())
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
        return Objects.hash(getPatientIdentifierTypeId(), getName(), getDescription(), getFormat(),
                isRequired(), isUnique(), getFormatHint(), getValidator(), getCreatedAt(), getCreatedBy(),
                getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
