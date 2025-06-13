package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

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
    private String name;
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
}
