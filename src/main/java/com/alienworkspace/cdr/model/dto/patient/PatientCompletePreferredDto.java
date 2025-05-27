package com.alienworkspace.cdr.model.dto.patient;

import com.alienworkspace.cdr.model.dto.person.PersonAddressDto;
import com.alienworkspace.cdr.model.dto.person.PersonAttributeDto;
import com.alienworkspace.cdr.model.dto.person.PersonDto;
import com.alienworkspace.cdr.model.dto.person.PersonNameDto;
import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
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
public class PatientCompletePreferredDto extends AuditTrail {

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

    private PersonDto person;

    private PersonAddressDto preferredAddress;

    private PersonNameDto preferredName;

    private List<PatientIdentifierDto> patientIdentifierDtos = new ArrayList<>();

    private List<PatientProgramDto> patientPrograms = new ArrayList<>();

    private List<PersonAttributeDto> patientAttributes = new ArrayList<>();

}
