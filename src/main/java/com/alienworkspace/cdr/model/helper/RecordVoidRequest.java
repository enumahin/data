package com.alienworkspace.cdr.model.helper;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RecordVoidRequest {

    private String resourceUUID;

    private String resourceId;

    private String voidReason;
}
