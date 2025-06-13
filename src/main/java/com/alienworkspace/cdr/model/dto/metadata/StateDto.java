package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "StateDto", description = "State Data Transfer Object")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateDto extends AuditTrail {

    @Schema(description = "State Id", example = "1")
    private Integer stateId;

    @Schema(description = "State Name", example = "California")
    private String stateName;

    @Schema(description = "State Locale", example = "en")
    private String locale;

    @Schema(description = "Is the state preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "State Code", example = "CA")
    private String stateCode;

    @Schema(description = "State Geo Code", example = "US")
    private String stateGeoCode;

    @Schema(description = "State Phone Code", example = "1")
    private Integer statePhoneCode;

    @Schema(description = "Country")
    private CountryDto country;

    @Schema(description = "Communities")
    @Builder.Default
    private Set<CountyDto> counties = new HashSet<>();
}
