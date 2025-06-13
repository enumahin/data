package com.alienworkspace.cdr.model.dto.metadata;

import com.alienworkspace.cdr.model.helper.AuditTrail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Objects;

@Schema(name = "ConceptDto", description = "Concept Data Transfer Object")
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class ConceptDto extends AuditTrail {

    @Schema(description = "Concept Id", example = "1")
    private Long conceptId;

    @Schema(description = "Concept Short Name", example = "en")
    private String shortName;

    @Schema(description = "Concept Description", example = "English")
    private String description;

    @Schema(description = "Concept Version", example = "1.0")
    private String version;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConceptDto that = (ConceptDto) o;
        return Objects.equals(getConceptId(), that.getConceptId())
                && Objects.equals(getShortName(), that.getShortName())
                && Objects.equals(getDescription(), that.getDescription())
                && Objects.equals(getVersion(), that.getVersion())
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
        return Objects.hash(getConceptId(), getShortName(), getDescription(), getVersion(),
                getCreatedAt(), getCreatedBy(), getLastModifiedAt(), getLastModifiedBy(), getVoided(), getVoidedAt(),
                getVoidedBy(), getVoidReason());
    }
}
