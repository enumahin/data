package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Schema(name = "CommunityDto", description = "Community Data Transfer Object")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommunityDto extends AuditTrail {
    @Schema(description = "Community Id")
    private Integer communityId;

    @Schema(description = "Community Name", example = "Santa Clara")
    private String communityName;

    @Schema(description = "Community Locale", example = "en")
    private String locale;

    @Schema(description = "Is the community preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Community Code", example = "CA")
    private String communityCode;

    @Schema(description = "Community Geo Code", example = "CA")
    private String communityGeoCode;

    @Schema(description = "Community Phone Code", example = "1")
    private Integer communityPhoneCode;

    @Schema(description = "State")
    private StateDto state;

    @Schema(description = "County")
    private CountyDto county;

    @Schema(description = "City")
    private CityDto city;

    @Schema(description = "Locations")
    @Builder.Default
    private Set<LocationDto> locations = new HashSet<>();
}
