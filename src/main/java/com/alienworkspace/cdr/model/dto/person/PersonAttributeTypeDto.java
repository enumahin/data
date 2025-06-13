package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

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
}
