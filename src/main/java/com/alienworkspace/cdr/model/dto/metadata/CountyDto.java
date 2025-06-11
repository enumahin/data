package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountyDto extends AuditTrail {
    private Integer countyId;
    private String countyName;
    private String locale;
    private boolean localePreferred;
    private String countyCode;
    private String countyGeoCode;
    private Integer countyPhoneCode;
    private Set<CityDto> cities = new HashSet<>();
}
