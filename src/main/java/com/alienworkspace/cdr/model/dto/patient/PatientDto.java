package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.dto.person.PersonAttributeDto;
import com.alienworkspace.cdr.model.dto.person.PersonDto;
import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(
    name = "Patient Dto",
        description = "Patient Dto for patient entity"
)
public class PatientDto extends AuditTrail {

    @Schema(
            description = "Patient Id",
            example = "1"
    )
    private Long patientId;
    @Schema(
            name = "Patient Allergies",
            description = "Patient Allergies",
            example = "Penicillin, Aspirin"
    )
    private String allergies;

    @Schema(
            name = "Patient Birth Date",
            description = "Patient Birth Date",
            example = "2020-12-31"
    )
    private String birthDate;

    @Schema(
            name = "Patient Death Date",
            description = "Patient Death Date",
            example = "2020-12-31"
    )
    private String deathDate;

    @Schema(
            name = "Patient Gender",
            description = "Patient Gender",
            example = "M=Male and F=Female"
    )
    private String gender;

    @Schema(
            name = "Patient Person",
            description = "Patient Person",
            example = "123456789"
    )
    private PersonDto person;

    @Schema(
            name = "Patient Identifier",
            description = "Patient Identifier",
            example = "123456789"
    )
    private String identifier;

    @Schema(
            name = "Patient Identifier Type",
            description = "Patient Identifier Type",
            example = "National ID"
    )
    private String identifierType;

    @Schema(
            name = "Patient Identifier Type Id",
            description = "Patient Identifier Type Id",
            example = "1"
    )
    private Integer identifierTypeId;

    @Schema(
            name = "Patient Identifier Dtos",
            description = "Patient Identifier Dtos",
            example = "123456789"
    )
    private List<PatientIdentifierDto> patientIdentifierDtos = new ArrayList<>();

    @Schema(
            name = "Patient Program Dtos",
            description = "Patient Program Dtos",
            example = "123456789"
    )
    private List<PatientProgramDto> patientPrograms = new ArrayList<>();

    @Schema(
            name = "Patient Attributes",
            description = "Patient Attributes",
            example = "123456789"
    )
    private List<PersonAttributeDto> patientAttributes = new ArrayList<>();

}
