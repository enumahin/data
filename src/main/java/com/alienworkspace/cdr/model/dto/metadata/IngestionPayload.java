package com.alienworkspace.cdr.model.dto.metadata;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class IngestionPayload {
    private Integer countryId;
    private Integer stateId;
    private Integer countyId;
    private Integer cityId;
    private Integer communityId;
    private Integer facilityId;
    private String facilityUUID;
    private String facilityDatimCode;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IngestionPayload that = (IngestionPayload) o;
        return Objects.equals(getCountryId(), that.getCountryId()) && Objects.equals(getStateId(), that.getStateId())
                && Objects.equals(getCountyId(), that.getCountyId()) && Objects.equals(getCityId(), that.getCityId())
                && Objects.equals(getCommunityId(), that.getCommunityId())
                && Objects.equals(getFacilityId(), that.getFacilityId())
                && Objects.equals(getFacilityUUID(), that.getFacilityUUID())
                && Objects.equals(getFacilityDatimCode(), that.getFacilityDatimCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryId(), getStateId(), getCountyId(), getCityId(), getCommunityId(), getFacilityId(),
                getFacilityUUID(), getFacilityDatimCode());
    }
}
