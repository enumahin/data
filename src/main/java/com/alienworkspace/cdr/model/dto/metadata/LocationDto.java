package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto extends AuditTrail {

    private Integer locationId;
    private String locationName;
    private String locale;
    private boolean localePreferred;
    private String locationCode;
    private String locationGeoCode;
    private Integer locationPhoneCode;
    private CommunityDto community;
}
