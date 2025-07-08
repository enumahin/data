package com.alienworkspace.cdr.model.dto.metadata;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * GlobalProperty.
 *
 * @author Firstname Lastname
 */
@Schema(description = "GlobalProperty")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GlobalProperty {

    @Schema(description = "Property Name", example = "FacilityId")
    private String property;

    @Schema(description = "Property Value", example = "General Hospital")
    private String value;
}
