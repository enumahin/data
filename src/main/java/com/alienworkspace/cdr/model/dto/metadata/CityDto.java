package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull(message = "City Name cannot be null")
    @Size(min = 3, max = 100, message = "City Name must be between 3 and 100 characters")
    private String cityName;

    @Schema(description = "City Locale", example = "en")
    private String locale;

    @Schema(description = "Is the city preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "City Code", example = "CA")
    @NotNull(message = "City Code cannot be null")
    @Size(min = 2, max = 10, message = "City Code must be between 2 and 10 characters")
    private String cityCode;

    @Schema(description = "City Geo Code", example = "CA")
    private String cityGeoCode;

    @Schema(description = "City Phone Code", example = "1")
    private Integer cityPhoneCode;

    @Schema(description = "County")
    @NotNull(message = "County cannot be null")
    private CountyDto county;

    @Schema(description = "Communities")
    @Builder.Default
    private Set<CommunityDto> communities = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CityDto cityDto = (CityDto) o;
        return isLocalePreferred() == cityDto.isLocalePreferred()
                && Objects.equals(getCityId(), cityDto.getCityId())
                && Objects.equals(getCityName(), cityDto.getCityName())
                && Objects.equals(getLocale(), cityDto.getLocale())
                && Objects.equals(getCityCode(), cityDto.getCityCode())
                && Objects.equals(getCityGeoCode(), cityDto.getCityGeoCode())
                && Objects.equals(getCityPhoneCode(), cityDto.getCityPhoneCode())
                && Objects.equals(getCounty(), cityDto.getCounty())
                && Objects.equals(getCommunities(), cityDto.getCommunities())
                && Objects.equals(getCreatedAt(), cityDto.getCreatedAt())
                && Objects.equals(getCreatedBy(), cityDto.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), cityDto.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), cityDto.getLastModifiedBy())
                && Objects.equals(getVoided(), cityDto.getVoided())
                && Objects.equals(getVoidedAt(), cityDto.getVoidedAt())
                && Objects.equals(getVoidedBy(), cityDto.getVoidedBy())
                && Objects.equals(getVoidReason(), cityDto.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityId(), getCityName(), getLocale(), isLocalePreferred(),
                getCityCode(), getCityGeoCode(), getCityPhoneCode(), getCounty(), getCommunities(),
                getCreatedAt(), getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(),
                getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
