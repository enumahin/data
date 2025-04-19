package com.alienworkspace.cdr.model.dto.person;

import lombok.*;

@Getter
@Setter
@Builder
public class PersonAttributeDto{

    private int personAttributeId;
    private long person_id;
    private int personAttributeTypeId;
    private String value;
}
