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
public class CountryDto extends AuditTrail {
    private Integer countryId;
    private String countryCode;
    private String countryName;
    private Integer countryPhoneCode;
    private String locale;
    private String currencyCode;
    private String currencySymbol;
    private String currencyName;
    private String currencyGeoCode;
    private boolean localePreferred;
    private Set<StateDto> states = new HashSet<>();
}
