package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
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
    @NotNull(message = "Community Name cannot be null")
    @Size(min = 3, max = 100, message = "Community Name must be between 3 and 100 characters")
    private String communityName;

    @Schema(description = "Community Locale", example = "en")
    private String locale;

    @Schema(description = "Is the community preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Community Code", example = "CA")
    @NotNull(message = "Community Code cannot be null")
    @Size(min = 2, max = 10, message = "Community Code must be between 2 and 10 characters")
    private String communityCode;

    @Schema(description = "Community Geo Code", example = "CA")
    private String communityGeoCode;

    @Schema(description = "Community Phone Code", example = "1")
    private Integer communityPhoneCode;

    @Schema(description = "City")
    @NotNull(message = "City cannot be null")
    private CityDto city;

    @Schema(description = "Facilities")
    @Builder.Default
    private Set<FacilityDto> facilities = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommunityDto that = (CommunityDto) o;
        return isLocalePreferred() == that.isLocalePreferred()
                && Objects.equals(getCommunityId(), that.getCommunityId())
                && Objects.equals(getCommunityName(), that.getCommunityName())
                && Objects.equals(getLocale(), that.getLocale())
                && Objects.equals(getCommunityCode(), that.getCommunityCode())
                && Objects.equals(getCommunityGeoCode(), that.getCommunityGeoCode())
                && Objects.equals(getCommunityPhoneCode(), that.getCommunityPhoneCode())
                && Objects.equals(getCity(), that.getCity())
                && Objects.equals(getFacilities(), that.getFacilities())
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
        return Objects.hash(getCommunityId(), getCommunityName(), getLocale(), isLocalePreferred(),
                getCommunityCode(), getCommunityGeoCode(), getCommunityPhoneCode(), getCity(),
                getFacilities());
    }
}
