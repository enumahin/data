package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import com.google.common.base.MoreObjects;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * FacilityDto.
 *
 * @author Firstname Lastname
 */
@Schema(description = "Facility")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacilityDto extends AuditTrail {

    @Schema(description = "Facility ID")
    private Long id;

    @Schema(description = "Facility Short Name")
    private String shortName;

    @Schema(description = "Facility Name")
    private String name;

    @Schema(description = "Facility Description")
    private String description;

    @Schema(description = "Facility Datim Code")
    private String datimCode;

    @Schema(description = "Facility Address")
    private String address;

    @Schema(description = "Facility Phone Number")
    private String phoneNumber;

    @Schema(description = "Facility Email")
    private String email;

    @Schema(description = "Facility Latitude")
    private Double latitude;

    @Schema(description = "Facility Longitude")
    private Double longitude;

    @Schema(description = "Facility Community")
    private CommunityDto community;

    @Schema(description = "Facility Care Entry Points")
    private Set<LocationDto> locations = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FacilityDto that = (FacilityDto) o;
        return Objects.equals(id, that.id) && Objects.equals(shortName, that.shortName)
                && Objects.equals(name, that.name) && Objects.equals(description, that.description)
                && Objects.equals(datimCode, that.datimCode) && Objects.equals(address, that.address)
                && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(email, that.email)
                && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude)
                && Objects.equals(locations, that.locations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, shortName, name, description, datimCode, address, phoneNumber, email,
                latitude, longitude, locations);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("shortName", shortName)
                .add("name", name)
                .add("description", description)
                .add("datimCode", datimCode)
                .add("address", address)
                .add("phoneNumber", phoneNumber)
                .add("email", email)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .add("locations", locations)
                .toString();
    }
}
