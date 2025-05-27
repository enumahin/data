package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@Getter
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
}
