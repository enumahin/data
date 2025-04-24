package com.alienworkspace.cdr.model.dto.person;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonAttributeTypeDto {
    private int personAttributeTypeId;
    private String name;
    private String description;
    private String format;
    private String uuid;
}
