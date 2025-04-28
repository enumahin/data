package com.alienworkspace.cdr.model.helper;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Dto for exchanging HttpError Exception.
 */
@Schema(
        name = "ErrorResponseDto",
        description = "Exception response entity"
)
@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "Endpoint called"
    )
    private String apiPath;

    @Schema(
            description = "Response Status Code",
            minimum = "400",
            maximum = "500"
    )
    private int errorCode;

    @Schema(
            description = "Error Message"
    )
    private String errorMessage;

    @Schema(
            description = "Time the Exception was raised"
    )
    private LocalDateTime errorTime;
}
