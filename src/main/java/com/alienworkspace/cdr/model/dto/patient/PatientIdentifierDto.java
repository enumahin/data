package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@Schema(
        name = "PatientIdentifierDto",
        description = "Patient Identifier Dto")
public class PatientIdentifierDto extends AuditTrail {
    @Schema(
            description = "Patient Identifier Id",
            example = "1"
    )
    private Long patientIdentifierId;
    @Schema(
            description = "Patient Id",
            example = "1"
    )
    private long patientId;
    @Schema(
            description = "Patient Identifier Type Id",
            example = "1"
    )
    private int identifierTypeId;
    @Schema(
            description = "Patient Identifier",
            example = "123456789"
    )
    private String identifier;
    @Schema(
            description = "Is this the preferred identifier?",
            example = "true"
    )
    private boolean preferred = true;
    @Schema(
            description = "Location Id",
            example = "1"
    )
    private Integer locationId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PatientIdentifierDto that = (PatientIdentifierDto) o;
        return getPatientId() == that.getPatientId()
                && getIdentifierTypeId() == that.getIdentifierTypeId()
                && isPreferred() == that.isPreferred()
                && Objects.equals(getPatientIdentifierId(), that.getPatientIdentifierId())
                && Objects.equals(getIdentifier(), that.getIdentifier())
                && Objects.equals(getLocationId(), that.getLocationId())
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
        return Objects.hash(getPatientIdentifierId(), getPatientId(), getIdentifierTypeId(),
                getIdentifier(), isPreferred(), getLocationId(), getCreatedAt(), getCreatedBy(),
                getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
