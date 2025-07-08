package com.alienworkspace.cdr.model.dto.visit;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 * VisitDto.
 *
 * @author Firstname Lastname
 */
@Schema(description = "Patient's Visit", name = "Visit")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitDto extends AuditTrail {

    @Schema(description = "Visit UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String id;

    @Schema(description = "Patient UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String patientId;

    @Schema(description = "Visit Date", example = "2020-12-31")
    private LocalDateTime visitStartDate;

    @Schema(description = "Visit End Date", example = "2020-12-31")
    private LocalDateTime visitEndDate;

    @Schema(description = "Visit Type", example = "1")
    private int visitType;

    @Schema(description = "Visit Type Name", example = "Pre-ART")
    private String visitTypeName;

    @Schema(description = "Visit Location", example = "123e4567-e89b-12d3-a456-426655440000")
    private String location;

    @Schema(description = "Visit Location", example = "123e4567-e89b-12d3-a456-426655440000")
    private String locationUuid;

    @Schema(description = "Encounters", example = "[]")
    @Builder.Default
    private Set<EncounterDto> encounterDtos = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        VisitDto visitDto = (VisitDto) o;
        return visitType == visitDto.visitType && Objects.equals(id, visitDto.id)
                && Objects.equals(patientId, visitDto.patientId)
                && Objects.equals(visitStartDate, visitDto.visitStartDate)
                && Objects.equals(visitEndDate, visitDto.visitEndDate)
                && Objects.equals(visitTypeName, visitDto.visitTypeName)
                && Objects.equals(location, visitDto.location) && Objects.equals(locationUuid, visitDto.locationUuid)
                && Objects.equals(encounterDtos, visitDto.encounterDtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, patientId, visitStartDate, visitEndDate, visitType, visitTypeName,
                location, locationUuid, encounterDtos);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("patientId", patientId)
                .add("visitStartDate", visitStartDate)
                .add("visitEndDate", visitEndDate)
                .add("visitType", visitType)
                .add("visitTypeName", visitTypeName)
                .add("location", location)
                .add("locationUuid", locationUuid)
                .add("encounterDtos", encounterDtos)
                .toString();
    }
}
