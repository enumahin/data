package com.alienworkspace.cdr.model.dto.person;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonNameDto{

    private long personNameId;

    private long personId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String otherName;

    private boolean preferred;
}
