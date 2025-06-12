package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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

    private boolean preferred;
}
