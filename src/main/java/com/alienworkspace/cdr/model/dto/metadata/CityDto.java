package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto extends AuditTrail {
    private Integer cityId;
    private String cityName;
    private String locale;
    private boolean localePreferred;
    private String cityCode;
    private String cityGeoCode;
    private Integer cityPhoneCode;
    private CountyDto county;
    private Set<CommunityDto> communities = new HashSet<>();
}
