package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

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
    private String firstName;

    @Schema(
            description = "Middle Name"
    )
    private String middleName;

    @Schema(
            description = "Last/Family Name"
    )
    private String lastName;

    @Schema(
            description = "Any other name like maiden/nick name"
    )
    private String otherName;

    @Schema(
            description = "Is this the preferred name?"
    )
    private Boolean preferred;
}
