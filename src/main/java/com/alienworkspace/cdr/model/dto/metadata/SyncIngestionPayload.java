package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.dto.patient.PatientDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SyncIngestionPayload extends IngestionPayload {

    private Set<PatientDto> patients;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SyncIngestionPayload that = (SyncIngestionPayload) o;
        return Objects.equals(patients, that.patients) && Objects.equals(getCountryId(), that.getCountryId())
                && Objects.equals(getStateId(), that.getStateId())
                && Objects.equals(getCountyId(), that.getCountyId()) && Objects.equals(getCityId(), that.getCityId())
                && Objects.equals(getCommunityId(), that.getCommunityId())
                && Objects.equals(getFacilityId(), that.getFacilityId())
                && Objects.equals(getFacilityUUID(), that.getFacilityUUID())
                && Objects.equals(getFacilityDatimCode(), that.getFacilityDatimCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(patients, getCountryId(), getStateId(), getCountyId(), getCityId(), getCommunityId(),
                getFacilityId(), getFacilityUUID(), getFacilityDatimCode());
    }
}
