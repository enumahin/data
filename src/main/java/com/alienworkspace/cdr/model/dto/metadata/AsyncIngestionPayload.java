package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.dto.patient.PatientDto;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AsyncIngestionPayload extends IngestionPayload {
    private PatientDto patient;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AsyncIngestionPayload that = (AsyncIngestionPayload) o;
        return Objects.equals(patient, that.patient) && Objects.equals(getCountryId(), that.getCountryId())
                && Objects.equals(getStateId(), that.getStateId())
                && Objects.equals(getCountyId(), that.getCountyId()) && Objects.equals(getCityId(), that.getCityId())
                && Objects.equals(getCommunityId(), that.getCommunityId())
                && Objects.equals(getFacilityId(), that.getFacilityId())
                && Objects.equals(getFacilityUUID(), that.getFacilityUUID())
                && Objects.equals(getFacilityDatimCode(), that.getFacilityDatimCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(patient, getCountryId(), getStateId(), getCountyId(), getCityId(), getCommunityId(),
                getFacilityId(), getFacilityUUID(), getFacilityDatimCode());
    }
}
