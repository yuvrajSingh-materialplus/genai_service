package com.budgetpulse.genai_service.util;

import com.budgetpulse.genai_service.dto.CampaignAnalyticsDto;

import java.time.LocalDate;
import java.util.List;

public class PromptBuilder {
    public static String buildPrompt(String clientId, LocalDate startDate, LocalDate endDate, List<CampaignAnalyticsDto> campaigns) {
        StringBuilder sb = new StringBuilder();
        sb.append("You are an AI marketing assistant specializing in campaign performance optimization.\\n");
        sb.append("Analyze the effectiveness of ad campaigns for client ").append(clientId)
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

        sb.append("\nBased on this data:\n");
        sb.append("1. Identify campaigns that are underperforming in terms of CTR, CPC, CPA, or conversion rates.\n");
        sb.append("2. Provide optimization strategies for each underperforming campaign.\n");
        sb.append("3. Suggest budget reallocations or bidding strategies if applicable.\n");
        sb.append("4. Recommend ad creative or targeting refinements to improve results.\n");

        sb.append("\nEnsure recommendations are data-driven and practical.");
        return sb.toString();
    }
}
