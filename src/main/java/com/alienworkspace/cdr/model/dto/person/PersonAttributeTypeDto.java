package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

@Schema(
        name = "PersonAttributeType data transfer object.",
        description = "Data transfer object for a person's attribute type."
)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonAttributeTypeDto extends AuditTrail {

    @Schema(
            description = "Attribute type Id",
            example = "1"
    )
    private Integer personAttributeTypeId;

    @Schema(
            description = "Attribute name",
            example = "Marital Status, Phone Number, etc"
    )
    @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    private String name;

    @Schema(
            description = "Description of the attribute"
    )
    private String description;

    @Schema(
            description = "Expected Value's format",
            example = "Number, Text, File, etc"
    )
    private String format;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonAttributeTypeDto that = (PersonAttributeTypeDto) o;
        return Objects.equals(getPersonAttributeTypeId(), that.getPersonAttributeTypeId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getDescription(), that.getDescription())
                && Objects.equals(getFormat(), that.getFormat())
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
        return Objects.hash(getPersonAttributeTypeId(), getName(), getDescription(), getFormat(),
                getCreatedAt(), getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(),
                getVoidedBy(), getVoidReason());
    }
}
