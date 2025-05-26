package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "PatientIdentifierType",
    description = "Patient Identifier Type"
)
public class PatientIdentifierTypeDto extends AuditTrail {

    @Schema(
            description = "Patient Identifier Type Id",
            example = "1"
    )
    private Integer patientIdentifierTypeId;

    @Schema(
            description = "Patient Identifier Type Name",
            example = "National ID"
    )
    private String name;

    @Schema(
            description = "Patient Identifier Type Description",
            example = "National ID"
    )
    private String description;

    @Schema(
            description = "Patient Identifier Type Format",
            example = "Number"
    )
    private String format;

    @Schema(
            description = "Patient Identifier Type Required",
            example = "true"
    )
    private boolean required;

    @Schema(
            description = "Patient Identifier Type Unique",
            example = "true"
    )
    private boolean unique;

    @Schema(
            description = "Patient Identifier Type Hint",
            example = "Alpha Numeric Characters Only"
    )
    private String formatHint;

    @Schema(
            description = "Patient Identifier Type Validator",
            example = "National ID Validator"
    )
    private String validator;
}
