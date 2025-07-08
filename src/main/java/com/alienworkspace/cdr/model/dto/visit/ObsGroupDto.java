package com.alienworkspace.cdr.model.dto.visit;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * ObsGroupDto.
 *
 * @author Firstname Lastname
 */
@Schema(description = "Observation Group", name = "ObsGroupDto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ObsGroupDto extends AuditTrail {

    @Schema(description = "Concept Id", name = "conceptId")
    private long conceptId;

    @Schema(description = "Concept Name", name = "conceptName")
    private String conceptName;

    @Schema(description = "Value Concept", name = "valueConcept")
    private Integer valueConcept;

    @Schema(description = "Value Text", name = "valueText")
    private String valueText;

    @Schema(description = "Value Date Time", name = "valueDateTime")
    private LocalDateTime valueDateTime;

    @Schema(description = "Value Numeric", name = "valueNumeric")
    private Double valueNumeric;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)){
            return false;
        }
        ObsGroupDto that = (ObsGroupDto) o;
        return conceptId == that.conceptId && Objects.equals(conceptName, that.conceptName)
                && Objects.equals(valueConcept, that.valueConcept) && Objects.equals(valueText, that.valueText)
                && Objects.equals(valueDateTime, that.valueDateTime) && Objects.equals(valueNumeric, that.valueNumeric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), conceptId, conceptName, valueConcept, valueText, valueDateTime,
                valueNumeric);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("conceptId", conceptId)
                .add("conceptName", conceptName)
                .add("valueConcept", valueConcept)
                .add("valueText", valueText)
                .add("valueDateTime", valueDateTime)
                .add("valueNumeric", valueNumeric)
                .toString();
    }
}
