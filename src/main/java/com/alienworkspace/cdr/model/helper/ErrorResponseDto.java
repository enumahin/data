package com.alienworkspace.cdr.model.helper;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Dto for exchanging HttpError Exception.
 */
@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath;

    private int errorCode;

    private String errorMessage;

    private LocalDateTime errorTime;
}
