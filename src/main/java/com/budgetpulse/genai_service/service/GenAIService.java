package com.budgetpulse.genai_service.service;

import java.time.LocalDate;

public interface GenAIService {
    String generateRecommendation(String clientId, LocalDate startDate, LocalDate endDate);
}
