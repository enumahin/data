package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Schema(
        name = "PersonAttributeDto",
        description = "Data transfer object for a person's attribute entry"
)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonAttributeDto extends AuditTrail {

    @Schema(
            description = "The person's Attribute Id"
    )
    @NotNull(message = "Person's Attribute ID must be provided.")
    private Long personAttributeId;

    @Schema(
            description = "The person's Id"
    )
    @NotNull(message = "Person's ID must be provided.")
    private long person_id;

    @Schema(
            description = "The Attribute's Id"
    )
    @NotNull(message = "Attribute ID must be provided.")
    private PersonAttributeTypeDto personAttributeType;

    @Schema(
            description = "Value of the Attribute"
    )
    @NotNull(message = "Attribute value must be provided.")
    private String value;

    @Schema(
            description = "Is this the preferred attribute?"
    )
    @NotNull(message = "Is this the preferred attribute?")
    private boolean preferred;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonAttributeDto that = (PersonAttributeDto) o;
        return getPerson_id() == that.getPerson_id()
                && isPreferred() == that.isPreferred()
                && Objects.equals(getPersonAttributeId(), that.getPersonAttributeId())
                && Objects.equals(getPersonAttributeType(), that.getPersonAttributeType())
                && Objects.equals(getValue(), that.getValue())
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
        return Objects.hash(getPersonAttributeId(), getPerson_id(), getPersonAttributeType(),
                getValue(), isPreferred(), getCreatedAt(), getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(),
                getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
