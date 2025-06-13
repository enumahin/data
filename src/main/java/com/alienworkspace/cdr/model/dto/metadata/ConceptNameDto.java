package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(name = "ConceptNameDto", description = "Concept Name Data Transfer Object")
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class ConceptNameDto extends AuditTrail {

    @Schema(description = "Concept Name Id", example = "1")
    private Long conceptNameId;

    @Schema(description = "Concept Id", example = "1")
    private Long conceptId;

    @Schema(description = "Concept Name", example = "English")
    private String conceptName;

    @Schema(description = "Locale", example = "en")
    private String locale;

    @Schema(description = "Is the locale preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Concept Short Name", example = "EN")
    private String conceptShortName;

    @Schema(description = "Concept Description", example = "English")
    private String conceptDescription;
}
