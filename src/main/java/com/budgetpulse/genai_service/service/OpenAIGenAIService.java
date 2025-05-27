package com.budgetpulse.genai_service.service;

import com.budgetpulse.genai_service.dto.CampaignAnalyticsDto;
import com.budgetpulse.genai_service.util.PromptBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OpenAIGenAIService implements GenAIService {

    @Override
    public String generateRecommendation(String clientId, LocalDate startDate, LocalDate endDate) {
        // Mock some campaign analytics for now
        List<CampaignAnalyticsDto> mockCampaigns = List.of(
                new CampaignAnalyticsDto("CAMP001", 500, 10000, 150, 10, 0.015, 3.33, 50.0),
                new CampaignAnalyticsDto("CAMP002", 700, 12000, 100, 5, 0.008, 7.0, 140.0) // underperforming
        );

        String prompt = PromptBuilder.buildPrompt(clientId, startDate, endDate, mockCampaigns);

        // Here we will later call OpenAI
        return "🔍 Prompt:\n\n" + prompt + "\n\n📢 Response: (LLM response will appear here)";
    }
}
