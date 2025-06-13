package com.alienworkspace.cdr.model.helper;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

@Schema(
        name = "RecordVoidRequest",
        description = "POJO for requesting record deletion"
)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordVoidRequest {

    @Schema(
            description = "Reason for the deletion"
    )
    @NotNull(message = "Deletion reason must be provided")
    @Size(min = 4)
    private String voidReason;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RecordVoidRequest that = (RecordVoidRequest) o;
        return Objects.equals(getVoidReason(), that.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getVoidReason());
    }
}
