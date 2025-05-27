package com.budgetpulse.genai_service.util;

import com.budgetpulse.genai_service.dto.CampaignAnalyticsDto;

import java.time.LocalDate;
import java.util.List;

public class PromptBuilder {
    public static String buildPrompt(String clientId, LocalDate startDate, LocalDate endDate, List<CampaignAnalyticsDto> campaigns) {
        StringBuilder sb = new StringBuilder();
        sb.append("You are an AI marketing assistant.\n");
        sb.append("Analyze campaign performance for client ").append(clientId)
                .append(" from ").append(startDate).append(" to ").append(endDate).append(".\n\n");

        sb.append("Campaign Data:\n");
        for (CampaignAnalyticsDto dto : campaigns) {
            sb.append("Campaign ").append(dto.getCampaignId())
                    .append(" - Spend: $").append(dto.getSpend())
                    .append(", CTR: ").append(dto.getCtr())
                    .append(", CPC: ").append(dto.getCpc())
                    .append(", CPA: ").append(dto.getCpa())
                    .append(", Conversions: ").append(dto.getConversions()).append("\n");
        }

        sb.append("\nPlease identify underperforming campaigns and suggest actionable optimizations.");
        return sb.toString();
    }
}
