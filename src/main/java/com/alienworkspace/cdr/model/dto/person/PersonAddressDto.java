package com.alienworkspace.cdr.model.dto.person;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonAddressDto{

    private long personAddressId;

    private long personId;

    private boolean preferred;

    private int country;

    private int state;

    private int city;

    private String postalCode;

    private String addressLine1;

    private String addressLine2;

    private String addressLine3;

    private String landmark;

    private long longitude;

    private long latitude;

    private LocalDate startDate;

    private LocalDate endDate;
}
