package com.alienworkspace.cdr.model.helper;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Http response dto class.
 */
@Schema(
        name = "ResponseDto",
        description = "POJO for API call responses."
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Response status code.",
            minimum = "200",
            maximum = "201"
    )
    private int statusCode;

    @Schema(
            description = "Response Message."
    )
    private String statusMessage;
}
