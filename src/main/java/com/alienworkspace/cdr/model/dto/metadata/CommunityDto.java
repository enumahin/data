package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommunityDto extends AuditTrail {
    private Integer communityId;
    private String communityName;
    private String locale;
    private boolean localePreferred;
    private String communityCode;
    private String communityGeoCode;
    private Integer communityPhoneCode;
    private CityDto city;
    private Set<LocationDto> locations = new HashSet<>();
}
