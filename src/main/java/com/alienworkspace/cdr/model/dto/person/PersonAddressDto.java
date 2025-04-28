package com.alienworkspace.cdr.model.dto.person;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
    private int country;

    @Schema(
            description = "State of the Address"
    )
    @NotNull(message = "State must be provided.")
    private int state;

    @Schema(
            description = "LGA/County of the Address"
    )
    @NotNull(message = "LGA/County must be provided.")
    private int lga;

    @Schema(
            description = "City/Town of the Address"
    )
    @NotNull(message = "City/Town must be provided.")
    private int city;

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
}
