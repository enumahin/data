package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import java.util.HashSet;
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
}
