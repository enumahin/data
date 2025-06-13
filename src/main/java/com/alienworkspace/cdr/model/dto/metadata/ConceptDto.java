package com.alienworkspace.cdr.model.dto.metadata;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(name = "ConceptDto", description = "Concept Data Transfer Object")
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class ConceptDto {

    @Schema(description = "Concept Id", example = "1")
    private Long conceptId;

    @Schema(description = "Concept Short Name", example = "en")
    private String shortName;

    @Schema(description = "Concept Description", example = "English")
    private String description;

    @Schema(description = "Concept Version", example = "1.0")
    private String version;
}
