package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Schema(name = "LocationDto", description = "Location Data Transfer Object")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationDto extends AuditTrail {

    @Schema(description = "Location ID", example = "1")
    private Integer locationId;

    @Schema(description = "Location Name", example = "Nairobi")
    @NotNull(message = "Location Name cannot be null")
    @Size(min = 1, max = 100, message = "Location Name must be between 1 and 100 characters")
    private String locationName;

    @Schema(description = "Location Locale", example = "en")
    private String locale;

    @Schema(description = "Is the location preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Location Code", example = "KE")
    @NotNull(message = "Location Code cannot be null")
    @Size(min = 1, max = 20, message = "Location Code must be between 1 and 20 characters")
    private String locationCode;

    @Schema(description = "Location Geo Code", example = "US")
    private String locationGeoCode;

    @Schema(description = "Location Phone Code", example = "1")
    private Integer locationPhoneCode;

    @Schema(description = "Community")
    @NotNull(message = "Community cannot be null")
    private CommunityDto community;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocationDto that = (LocationDto) o;
        return isLocalePreferred() == that.isLocalePreferred()
                && Objects.equals(getLocationId(), that.getLocationId())
                && Objects.equals(getLocationName(), that.getLocationName())
                && Objects.equals(getLocale(), that.getLocale())
                && Objects.equals(getLocationCode(), that.getLocationCode())
                && Objects.equals(getLocationGeoCode(), that.getLocationGeoCode())
                && Objects.equals(getLocationPhoneCode(), that.getLocationPhoneCode())
                && Objects.equals(getCommunity(), that.getCommunity())
                && Objects.equals(getCreatedAt(), that.getCreatedAt())
                && Objects.equals(getCreatedBy(), that.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), that.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), that.getLastModifiedBy())
                && Objects.equals(getVoided(), that.getVoided())
                && Objects.equals(getVoidedAt(), that.getVoidedAt())
                && Objects.equals(getVoidedBy(), that.getVoidedBy())
                && Objects.equals(getVoidReason(), that.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocationId(), getLocationName(), getLocale(), isLocalePreferred(),
                getLocationCode(), getLocationGeoCode(), getLocationPhoneCode(), getCommunity(), getCreatedAt(),
                getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
