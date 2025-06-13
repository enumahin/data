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

@Schema(name = "CountryDto", description = "Country Data Transfer Object")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto extends AuditTrail {

    @Schema(description = "Country Id", example = "1")
    private Integer countryId;

    @Schema(description = "Country Code", example = "US")
    @NotNull(message = "Country Code cannot be null")
    @Size(min = 2, max = 2, message = "Country Code must be 2 characters")
    private String countryCode;

    @Schema(description = "Country Name", example = "United States of America")
    @NotNull(message = "Country Name cannot be null")
    @Size(min = 2, max = 50, message = "Country Name must be between 2 and 50 characters")
    private String countryName;

    @Schema(description = "Country Phone Code", example = "1")
    @NotNull(message = "Country Phone Code cannot be null")
    @Size(min = 1, max = 3, message = "Country Phone Code must be between 1 and 3 characters")
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
        return Objects.hash(getCountryId(), getCountryCode(), getCountryName(), getCountryPhoneCode(),
                getCountryGeoCode(), getLocale(), getCurrencyCode(), getCurrencySymbol(), getCurrencyName(),
                isLocalePreferred(), getStates(), getCreatedAt(), getCreatedBy(), getLastModifiedAt(),
                getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
