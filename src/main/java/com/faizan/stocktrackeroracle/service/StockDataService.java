package com.faizan.stocktrackeroracle.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockDataService {

    private static final String ALPHA_VANTAGE_API_URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol={symbol}&apikey={apiKey}";
    private final RestTemplate restTemplate = new RestTemplate();

    public String getRealTimeStockData(String symbol, String apiKey) {
        String url = ALPHA_VANTAGE_API_URL.replace("{symbol}", symbol).replace("{apiKey}", apiKey);

        try {
            String response = restTemplate.getForObject(url, String.class);
            System.out.println("Raw API Response for " + symbol + ": " + response);
            return response;
        } catch (Exception e) {
            System.err.println("API call failed for " + symbol + ": " + e.getMessage());
            return "{}"; // Return an empty JSON object to prevent frontend parsing errors
        }
    }
}