package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.dto.patient.PatientDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SyncIngestionPayload {

    private Integer countryId;
    private Integer stateId;
    private Integer countyId;
    private Integer cityId;
    private Integer communityId;
    private Integer facilityId;
    private String facilityUUID;
    private String facilityDatimCode;
    private Set<PatientDto> patient;
}
