package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Objects;

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
    @NotNull(message = "Concept Name cannot be null")
    @Size(min = 3, max = 100, message = "Concept Name must be between 3 and 100 characters")
    private String conceptName;

    @Schema(description = "Locale", example = "en")
    @NotNull(message = "Locale cannot be null")
    @Size(min = 2, max = 6, message = "Locale must be between 2 and 6 characters")
    private String locale;

    @Schema(description = "Is the locale preferred?", example = "true/false")
    private boolean localePreferred;

    @Schema(description = "Concept Short Name", example = "EN")
    private String conceptShortName;

    @Schema(description = "Concept Description", example = "English")
    private String conceptDescription;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConceptNameDto that = (ConceptNameDto) o;
        return isLocalePreferred() == that.isLocalePreferred()
                && Objects.equals(getConceptNameId(), that.getConceptNameId())
                && Objects.equals(getConceptId(), that.getConceptId())
                && Objects.equals(getConceptName(), that.getConceptName())
                && Objects.equals(getLocale(), that.getLocale())
                && Objects.equals(getConceptShortName(), that.getConceptShortName())
                && Objects.equals(getConceptDescription(), that.getConceptDescription())
                && Objects.equals(getCreatedAt(), that.getCreatedAt())
                && Objects.equals(getCreatedBy(), that.getCreatedBy())
                && Objects.equals(getLastModifiedAt(), that.getLastModifiedAt())
                && Objects.equals(getLastModifiedBy(), that.getLastModifiedBy())
                && Objects.equals(getVoided(), that.getVoided())
                && Objects.equals(getVoidedAt(), that.getVoidedAt())
                && Objects.equals(getVoidedBy(), that.getVoidedBy())
                && Objects.equals(getVoidReason(), that.getVoidReason());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getConceptNameId(), getConceptId(), getConceptName(), getLocale(),
                isLocalePreferred(), getConceptShortName(), getConceptDescription(), getCreatedAt(), getCreatedBy(),
                getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(), getVoidedBy(), getVoidReason());
    }
}
