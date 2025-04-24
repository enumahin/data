package com.alienworkspace.cdr.model.helper;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Http response dto class.
 */
@Data
@AllArgsConstructor
public class ResponseDto {

    private int statusCode;

    private String statusMessage;
}
