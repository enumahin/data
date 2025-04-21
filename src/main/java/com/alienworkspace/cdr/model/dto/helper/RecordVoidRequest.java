package com.alienworkspace.cdr.model.dto.helper;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RecordVoidRequest {

    private String uuid;

    private String id;

    private String voidReason;
}
