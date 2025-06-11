package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateDto extends AuditTrail {
    private Integer stateId;
    private String stateName;
    private String locale;
    private boolean localePreferred;
    private String stateCode;
    private String stateGeoCode;
    private Integer statePhoneCode;
    private Set<CountyDto> counties = new HashSet<>();
}
