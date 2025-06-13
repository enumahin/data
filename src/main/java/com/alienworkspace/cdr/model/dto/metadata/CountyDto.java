package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "CountyDto", description = "County Data Transfer Object")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountyDto extends AuditTrail {

    @Schema(description = "County Id", example = "1")
    private Integer countyId;

    @Schema(description = "County Name", example = "Santa Clara")
    private String countyName;

    @Schema(description = "County Locale", example = "en")
    private String locale;

    @Schema(description = "Is the county preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "County Code", example = "CA")
    private String countyCode;

    @Schema(description = "County Geo Code", example = "CA")
    private String countyGeoCode;

    @Schema(description = "County Phone Code", example = "1")
    private Integer countyPhoneCode;

    @Schema(description = "State")
    private StateDto state;

    @Schema(description = "Cities", example = "[]")
    @Builder.Default
    private Set<CityDto> cities = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CountyDto countyDto = (CountyDto) o;
        return isLocalePreferred() == countyDto.isLocalePreferred()
                && Objects.equals(getCountyId(), countyDto.getCountyId())
                && Objects.equals(getCountyName(), countyDto.getCountyName())
                && Objects.equals(getLocale(), countyDto.getLocale())
                && Objects.equals(getCountyCode(), countyDto.getCountyCode())
                && Objects.equals(getCountyGeoCode(), countyDto.getCountyGeoCode())
                && Objects.equals(getCountyPhoneCode(), countyDto.getCountyPhoneCode())
                && Objects.equals(getState(), countyDto.getState())
                && Objects.equals(getCities(), countyDto.getCities())
                && Objects.equals(getCreatedAt(), countyDto.getCreatedAt())
                && Objects.equals(getCreatedBy(), countyDto.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), countyDto.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), countyDto.getLastModifiedBy())
                && Objects.equals(getVoided(), countyDto.getVoided())
                && Objects.equals(getVoidedAt(), countyDto.getVoidedAt())
                && Objects.equals(getVoidedBy(), countyDto.getVoidedBy())
                && Objects.equals(getVoidReason(), countyDto.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCountyId(), getCountyName(), getLocale(), isLocalePreferred(),
                getCountyCode(), getCountyGeoCode(), getCountyPhoneCode(), getState(), getCities(), getCreatedAt(),
                getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
