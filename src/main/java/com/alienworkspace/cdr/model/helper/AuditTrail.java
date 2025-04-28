package com.alienworkspace.cdr.model.helper;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class AuditTrail {

    private Long createdBy;

    private LocalDateTime createdAt;

    private Long lastModifiedBy;

    private LocalDateTime lastModifiedAt;

    @Schema(
            description = "Is this record deleted?"
    )
    private Boolean voided;

    @Schema(
            description = "Who deleted it?"
    )
    private Long voidedBy;

    @Schema(
            description = "Date deleted?"
    )
    private LocalDateTime voidedAt;

    @Schema(
            description = "Why was it deleted?"
    )
    private String voidReason;

    private String uuid;
}
