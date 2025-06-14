package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
@Schema(
        name = "PatientProgramType",
    description = "Patient Program Type"
)
public class ProgramDto extends AuditTrail {

    @Schema(
            description = "Program Id",
            example = "1"
    )
    private Integer programId;

    @Schema(
            description = "Patient Program Type Name",
            example = "HIV Care Program"
    )
    @NotNull(message = "Name is required")
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @Schema(
            description = "Patient Program Type Code",
            example = "HIV"
    )
    @NotNull(message = "Code is required")
    @Size(min = 3, max = 20, message = "Code must be between 3 and 20 characters")
    private String programCode;

    @Schema(
            description = "Patient Program Type Description",
            example = "HIV Testing and Treatment Program"
    )
    private String description;

    @Schema(
            description = "Is the program active?",
            example = "true/false"
    )
    private boolean active = true;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgramDto that = (ProgramDto) o;
        return isActive() == that.isActive()
                && Objects.equals(getProgramId(), that.getProgramId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getProgramCode(), that.getProgramCode())
                && Objects.equals(getDescription(), that.getDescription())
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
        return Objects.hash(getProgramId(), getName(), getProgramCode(), getDescription(), isActive(), getCreatedAt(),
                getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("programId", programId)
                .add("name", name)
                .add("programCode", programCode)
                .add("description", description)
                .add("active", active)
                .add("createdAt", getCreatedAt())
                .add("createdBy", getCreatedBy())
                .add("lastModifiedAt", getLastModifiedAt())
                .add("lastModifiedBy", getLastModifiedBy())
                .add("voided", getVoided())
                .add("voidedAt", getVoidedAt())
                .add("voidedBy", getVoidedBy())
                .add("voidReason", getVoidReason())
                .toString();
    }
}
