package com.alienworkspace.cdr.model.helper;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * Http response dto class.
 */
@Schema(
        name = "ResponseDto",
        description = "POJO for API call responses."
)
@Data
@Builder
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ResponseDto that = (ResponseDto) o;
        return getStatusCode() == that.getStatusCode() && Objects.equals(getStatusMessage(), that.getStatusMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatusCode(), getStatusMessage());
    }
}
