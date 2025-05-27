package com.alienworkspace.cdr.model.dto.patient;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Schema(
        name = "PatientProgram",
    description = "Patient Program"
)
public class PatientProgramDto {

    @Schema(
            description = "Patient Program Id",
            example = "1"
    )
    private long patientProgramId;

    @Schema(
            description = "Patient Id",
            example = "1"
    )
    private long patientId;

    @Schema(
            description = "Program Id",
            example = "1"
    )
    private Integer programId;

    @Schema(
            description = "Location Id",
            example = "1"
    )
    private Integer locationId;

    @Schema(
            description = "Date Enrolled",
            example = "2020-12-31"
    )
    private LocalDate dateEnrolled;

    @Schema(
            description = "Date Completed",
            example = "2020-12-31"
    )
    private LocalDate dateCompleted;

    @Schema(
            description = "Outcome Concept Id",
            example = "1"
    )
    private Integer outcomeConceptId;

    @Schema(
            description = "Outcome Comment",
            example = "Outcome Comment"
    )
    private String outcomeComment;

}
