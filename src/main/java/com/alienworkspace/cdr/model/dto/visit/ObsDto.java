package com.alienworkspace.cdr.model.dto.visit;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * ObsDto.
 *
 * @author Firstname Lastname
 */
@Schema(description = "Observation Dto", name = "ObsDto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObsDto extends AuditTrail {

    @Schema(description = "Observation UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String id;

    @Schema(description = "Patient UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String patientId;

    @Schema(description = "Encounter UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String encounterId;

    @Schema(description = "Concept ID", example = "1")
    private long conceptId;

    @Schema(description = "Concept Name", example = "Language")
    private String conceptName;

    @Schema(description = "Concept Id of the answer is the answer is a concept", example = "132")
    private Integer valueConcept;

    @Schema(description = "Value it the answer is a text", example = "English")
    private String valueText;

    @Schema(description = "DateTime if the answer is a date", example = "2020-12-31")
    private LocalDate valueDateTime;

    @Schema(description = "Value if the answer is a number", example = "1.0")
    private Double valueNumeric;

    @Schema(description = "Value if the answer is a boolean", example = "true")
    private Boolean valueBoolean;

    @Schema(description = "Observation Group if the answer is a group", example = "[]")
    @Builder.Default
    private Set<ObsGroupDto> obsGroupDtos = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ObsDto obsDto = (ObsDto) o;
        return conceptId == obsDto.conceptId && Objects.equals(id, obsDto.id)
                && Objects.equals(patientId, obsDto.patientId) && Objects.equals(encounterId, obsDto.encounterId)
                && Objects.equals(conceptName, obsDto.conceptName) && Objects.equals(valueConcept, obsDto.valueConcept)
                && Objects.equals(valueText, obsDto.valueText) && Objects.equals(valueDateTime, obsDto.valueDateTime)
                && Objects.equals(valueNumeric, obsDto.valueNumeric)
                && Objects.equals(valueBoolean, obsDto.valueBoolean)
                && Objects.equals(obsGroupDtos, obsDto.obsGroupDtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, patientId, encounterId, conceptId, conceptName, valueConcept,
                valueText, valueDateTime, valueNumeric, valueBoolean, obsGroupDtos);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("patientId", patientId)
                .add("encounterId", encounterId)
                .add("conceptId", conceptId)
                .add("conceptName", conceptName)
                .add("valueConcept", valueConcept)
                .add("valueText", valueText)
                .add("valueDateTime", valueDateTime)
                .add("valueNumeric", valueNumeric)
                .add("valueBoolean", valueBoolean)
                .add("obsGroupDtos", obsGroupDtos)
                .toString();
    }
}
