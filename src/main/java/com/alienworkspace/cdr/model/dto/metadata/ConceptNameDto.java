package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class ConceptNameDto extends AuditTrail {

    private Long conceptNameId;

    private Long conceptId;

    private String conceptName;

    private String locale;

    private boolean localePreferred;

    private String conceptShortName;

    private String conceptDescription;
}
