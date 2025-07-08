package com.alienworkspace.cdr.model.dto.visit;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * EncounterDto.
 *
 * @author Firstname Lastname
 */
@Schema(description = "Patient Encounter", name = "EncounterDto")
@Getter
@AllArgsConstructor
@Builder
public class EncounterDto  extends AuditTrail {

    @Schema(description = "Encounter UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String id;

    @Schema(description = "Patient UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String patientId;

    @Schema(description = "Visit UUID", example = "123e4567-e89b-12d3-a456-426655440000")
    private String visitId;

    @Schema(description = "Location Id", example = "1")
    private int locationId;

    @Schema(description = "Datim Code", example = "123e4567-e89b-12d3-a456-426655440000")
    private String datimCode;

    @Schema(description = "Facility Id", example = "1")
    private long facilityID;

    @Schema(description = "Location", example = "123e4567-e89b-12d3-a456-426655440000")
    private String location;

    @Schema(description = "State Id", example = "1")
    private int stateID;

    @Schema(description = "Encounter Type", example = "1")
    private int encounterType;

    @Schema(description = "Form Id", example = "1")
    private int formId;

    @Schema(description = "Encounter Date", example = "2020-12-31")
    private LocalDateTime encounterDatetime;

    @Schema(description = "Encounter Observations", example = "[]")
    @Builder.Default
    private Set<ObsDto> obs = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        EncounterDto that = (EncounterDto) o;
        return Objects.equals(id, that.id) && Objects.equals(patientId, that.patientId)
                && Objects.equals(visitId, that.visitId) && locationId == that.locationId
                && facilityID == that.facilityID && stateID == that.stateID && encounterType == that.encounterType
                && formId == that.formId && Objects.equals(datimCode, that.datimCode)
                && Objects.equals(location, that.location) && Objects.equals(encounterDatetime, that.encounterDatetime)
                && Objects.equals(obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, patientId, visitId, locationId, datimCode, facilityID, location,
                stateID, encounterType, formId, encounterDatetime, obs);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("patientId", patientId)
                .add("visitId", visitId)
                .add("locationId", locationId)
                .add("datimCode", datimCode)
                .add("facilityID", facilityID)
                .add("location", location)
                .add("stateID", stateID)
                .add("encounterType", encounterType)
                .add("formId", formId)
                .add("encounterDatetime", encounterDatetime)
                .add("obs", obs)
                .toString();
    }
}
