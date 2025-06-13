package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.dto.metadata.*;
import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonAddressDto extends AuditTrail {

    private Long personAddressId;

    @Schema(
            description = "The person's Id"
    )
    @NotNull(message = "Person's ID must be provided.")
    private long personId;

    private boolean preferred = true;

    @Schema(
            description = "Country of the Address"
    )
    @NotNull(message = "Country must be provided.")
    private CountryDto country;

    @Schema(
            description = "State of the Address"
    )
    @NotNull(message = "State must be provided.")
    private StateDto state;

    @Schema(
            description = "LGA/County of the Address"
    )
    @NotNull(message = "LGA/County must be provided.")
    private CountyDto county;

    @Schema(
            description = "City/Town of the Address"
    )
    @NotNull(message = "City/Town must be provided.")
    private CityDto city;

    @Schema(
            description = "Community/Village of the Address"
    )
    @NotNull(message = "Community/Village must be provided.")
    private CommunityDto community;

    @Schema(
            description = "PostCode of the Address"
    )
    private String postalCode;

    @Schema(
            description = "Flat/House Number"
    )
    @NotNull(message = "Flat/House number must be provided.")
    private String addressLine1;

    @Schema(
            description = "House Name if any"
    )
    private String addressLine2;

    @Schema(
            description = "Street of the Address"
    )
    @NotNull(message = "Street name must be provided.")
    private String addressLine3;

    @Schema(
            description = "Any popular landmark close to the address."
    )
    private String landmark;

    @Schema(
            description = "Map longitude of the Address"
    )
    private long longitude;

    @Schema(
            description = "Map latitude of the Address"
    )
    private long latitude;

    @Schema(
            description = "When did the person start living in this address. (YYY-MM-DD)",
            example = "2020-10-12"
    )
    @NotNull(message = "Address start date must be provided.")
    private LocalDate startDate;

    @Schema(
            description = "When did the person stopped living in this address. (YYY-MM-DD)",
            example = "2020-10-12"
    )
    private LocalDate endDate;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PersonAddressDto that = (PersonAddressDto) o;
        return getPersonId() == that.getPersonId()
                && isPreferred() == that.isPreferred()
                && getLongitude() == that.getLongitude()
                && getLatitude() == that.getLatitude()
                && Objects.equals(getPersonAddressId(), that.getPersonAddressId())
                && Objects.equals(getCountry(), that.getCountry())
                && Objects.equals(getState(), that.getState())
                && Objects.equals(getCounty(), that.getCounty())
                && Objects.equals(getCity(), that.getCity())
                && Objects.equals(getCommunity(), that.getCommunity())
                && Objects.equals(getPostalCode(), that.getPostalCode())
                && Objects.equals(getAddressLine1(), that.getAddressLine1())
                && Objects.equals(getAddressLine2(), that.getAddressLine2())
                && Objects.equals(getAddressLine3(), that.getAddressLine3())
                && Objects.equals(getLandmark(), that.getLandmark())
                && Objects.equals(getStartDate(), that.getStartDate())
                && Objects.equals(getEndDate(), that.getEndDate())
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
        return Objects.hash(super.hashCode(), getPersonAddressId(), getPersonId(), isPreferred(), getCountry(),
                getState(), getCounty(), getCity(), getCommunity(), getPostalCode(), getAddressLine1(),
                getAddressLine2(), getAddressLine3(), getLandmark(), getLongitude(), getLatitude(), getStartDate(),
                getEndDate(), getCreatedAt(), getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(),
                getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
