package com.alienworkspace.cdr.model.dto.metadata;

import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class ConceptDto {

    private Long conceptId;

    private String shortName;

    private String description;

    private String version;
}
