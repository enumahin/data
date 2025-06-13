package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "LocationDto", description = "Location Data Transfer Object")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto extends AuditTrail {

    @Schema(description = "Location ID", example = "1")
    private Integer locationId;

    @Schema(description = "Location Name", example = "Nairobi")
    private String locationName;

    @Schema(description = "Location Locale", example = "en")
    private String locale;

    @Schema(description = "Is the location preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Location Code", example = "KE")
    private String locationCode;

    @Schema(description = "Location Geo Code", example = "US")
    private String locationGeoCode;

    @Schema(description = "Location Phone Code", example = "1")
    private Integer locationPhoneCode;

    @Schema(description = "Community")
    private CommunityDto community;
}
