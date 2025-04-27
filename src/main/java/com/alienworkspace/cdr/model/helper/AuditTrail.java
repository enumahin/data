package com.alienworkspace.cdr.model.helper;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditTrail {

    private Long createdBy;

    private LocalDateTime createdAt;

    private Long lastModifiedBy;

    private LocalDateTime lastModifiedAt;

    private Boolean voided;

    private Long voidedBy;

    private LocalDateTime voidedAt;

    private String voidReason;

    private String uuid;
}
