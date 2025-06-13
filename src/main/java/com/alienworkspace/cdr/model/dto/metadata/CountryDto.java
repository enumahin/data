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

@Schema(name = "CountryDto", description = "Country Data Transfer Object")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto extends AuditTrail {

    @Schema(description = "Country Id", example = "1")
    private Integer countryId;

    @Schema(description = "Country Code", example = "US")
    private String countryCode;

    @Schema(description = "Country Name", example = "United States of America")
    private String countryName;

    @Schema(description = "Country Phone Code", example = "1")
    private Integer countryPhoneCode;

    @Schema(description = "Country Geo Code", example = "US")
    private String countryGeoCode;

    @Schema(description = "Country Locale", example = "en")
    private String locale;

    @Schema(description = "Currency Code", example = "USD")
    private String currencyCode;

    @Schema(description = "Currency Symbol", example = "$")
    private String currencySymbol;

    @Schema(description = "Currency Name", example = "United States Dollar")
    private String currencyName;

    @Schema(description = "Is the country preferred?", example = "true/false")
    private boolean localePreferred;
    @Builder.Default
    @Schema(description = "State List", example = "[]")
    private Set<CityDto> cities = new HashSet<>();

    @Builder.Default
    @Schema(description = "State List", example = "[]")
    private Set<StateDto> states = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CountryDto that = (CountryDto) o;
        return isLocalePreferred() == that.isLocalePreferred()
                && Objects.equals(getCountryId(), that.getCountryId())
                && Objects.equals(getCountryCode(), that.getCountryCode())
                && Objects.equals(getCountryName(), that.getCountryName())
                && Objects.equals(getCountryPhoneCode(), that.getCountryPhoneCode())
                && Objects.equals(getCountryGeoCode(), that.getCountryGeoCode())
                && Objects.equals(getLocale(), that.getLocale())
                && Objects.equals(getCurrencyCode(), that.getCurrencyCode())
                && Objects.equals(getCurrencySymbol(), that.getCurrencySymbol())
                && Objects.equals(getCurrencyName(), that.getCurrencyName())
                && Objects.equals(getCities(), that.getCities())
                && Objects.equals(getStates(), that.getStates())
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
        return Objects.hash(super.hashCode(), getCountryId(), getCountryCode(), getCountryName(), getCountryPhoneCode(),
                getCountryGeoCode(), getLocale(), getCurrencyCode(), getCurrencySymbol(), getCurrencyName(),
                isLocalePreferred(), getCities(), getStates(), getCreatedAt(), getCreatedBy(), getLastModifiedAt(),
                getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
