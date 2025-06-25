package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

@Schema(
        name = "PersonNameDto",
        description = "Person name data transfer object."
)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonNameDto extends AuditTrail {

    @Schema(
            description = "Person Name Id"
    )
    private Long personNameId;

    @Schema(
            description = "Person Id"
    )
    private long personId;

    @Schema(
            description = "First/Given Name"
    )
    @Size(min = 3, max = 100, message = "First name must be between 3 and 100 characters")
    private String firstName;

    @Schema(
            description = "Middle Name"
    )
    private String middleName;

    @Schema(
            description = "Last/Family Name"
    )
    @Size(min = 3, max = 100, message = "Last name must be between 3 and 100 characters")
    private String lastName;

    @Schema(
            description = "Any other name like maiden/nick name"
    )
    private String otherName;

    @Schema(
            description = "Is this the preferred name?"
    )
    private Boolean preferred;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonNameDto that = (PersonNameDto) o;
        return getPersonId() == that.getPersonId()
                && Objects.equals(getPersonNameId(), that.getPersonNameId())
                && Objects.equals(getFirstName(), that.getFirstName())
                && Objects.equals(getMiddleName(), that.getMiddleName())
                && Objects.equals(getLastName(), that.getLastName())
                && Objects.equals(getOtherName(), that.getOtherName())
                && Objects.equals(getPreferred(), that.getPreferred())
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
        return Objects.hash(getPersonNameId(), getPersonId(), getFirstName(), getMiddleName(),
                getLastName(), getOtherName(), getPreferred(), getCreatedAt(), getCreatedBy(), getLastModifiedAt(),
                getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
