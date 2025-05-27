package com.budgetpulse.genai_service.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CampaignAnalyticsDto {
    private String campaignId;
    private double spend;
    private int impressions;
    private int clicks;
    private int conversions;
    private double ctr;
    private double cpc;
    private double cpa;
}