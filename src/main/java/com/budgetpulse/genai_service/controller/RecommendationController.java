package com.budgetpulse.genai_service.controller;

import com.budgetpulse.genai_service.service.GenAIService;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/genai")
public class RecommendationController {

    private final GenAIService genAIService;

    public RecommendationController(GenAIService genAIService) {
        this.genAIService = genAIService;
    }

    @GetMapping("/recommendations")
    public String getRecommendations(
            @RequestParam String clientId,
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate
    ) {
        return genAIService.generateRecommendation(clientId, startDate, endDate);
    }
}
