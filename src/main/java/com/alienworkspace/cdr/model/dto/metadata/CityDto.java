package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "CityDto")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto extends AuditTrail {

    @Schema(description = "City Id", example = "1")
    private Integer cityId;

    @Schema(description = "City Name", example = "Santa Clara")
    private String cityName;

    @Schema(description = "City Locale", example = "en")
    private String locale;

    @Schema(description = "Is the city preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "City Code", example = "CA")
    private String cityCode;

    @Schema(description = "City Geo Code", example = "CA")
    private String cityGeoCode;

    @Schema(description = "City Phone Code", example = "1")
    private Integer cityPhoneCode;

    @Schema(description = "State")
    private StateDto state;

    @Schema(description = "County")
    private CountyDto county;

    @Schema(description = "Communities")
    private Set<CommunityDto> communities = new HashSet<>();
}
