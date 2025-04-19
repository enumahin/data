package com.alienworkspace.cdr.model.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditTrailListener implements AuditorAware<Integer> {

    @Override
    public Optional<Integer> getCurrentAuditor() {
        return Optional.of(1);
    }
}
