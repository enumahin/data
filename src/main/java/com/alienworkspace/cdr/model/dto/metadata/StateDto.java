package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "StateDto", description = "State Data Transfer Object")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StateDto extends AuditTrail {

    @Schema(description = "State Id", example = "1")
    private Integer stateId;

    @Schema(description = "State Name", example = "California")
    @NotNull(message = "State Name cannot be null")
    @Size(min = 2, max = 50, message = "State Name must be between 2 and 50 characters")
    private String stateName;

    @Schema(description = "State Locale", example = "en")
    private String locale;

    @Schema(description = "Is the state preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "State Code", example = "CA")
    @NotNull(message = "State Code cannot be null")
    @Size(min = 2, max = 20, message = "State Code must be between 2 and 20 characters")
    private String stateCode;

    @Schema(description = "State Geo Code", example = "US")
    private String stateGeoCode;

    @Schema(description = "State Phone Code", example = "1")
    private Integer statePhoneCode;

    @Schema(description = "Country")
    @NotNull(message = "Country cannot be null")
    private CountryDto country;

    @Schema(description = "Communities")
    @Builder.Default
    private Set<CountyDto> counties = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StateDto stateDto = (StateDto) o;
        return isLocalePreferred() == stateDto.isLocalePreferred()
                && Objects.equals(getStateId(), stateDto.getStateId())
                && Objects.equals(getStateName(), stateDto.getStateName())
                && Objects.equals(getLocale(), stateDto.getLocale())
                && Objects.equals(getStateCode(), stateDto.getStateCode())
                && Objects.equals(getStateGeoCode(), stateDto.getStateGeoCode())
                && Objects.equals(getStatePhoneCode(), stateDto.getStatePhoneCode())
                && Objects.equals(getCountry(), stateDto.getCountry())
                && Objects.equals(getCounties(), stateDto.getCounties())
                && Objects.equals(getCreatedAt(), stateDto.getCreatedAt())
                && Objects.equals(getCreatedBy(), stateDto.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), stateDto.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), stateDto.getLastModifiedBy())
                && Objects.equals(getVoided(), stateDto.getVoided())
                && Objects.equals(getVoidedAt(), stateDto.getVoidedAt())
                && Objects.equals(getVoidedBy(), stateDto.getVoidedBy())
                && Objects.equals(getVoidReason(), stateDto.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStateId(), getStateName(), getLocale(), isLocalePreferred(),
                getStateCode(), getStateGeoCode(), getStatePhoneCode(), getCountry(), getCounties(), getCreatedAt(),
                getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(),
                getVoidReason());
    }
}
