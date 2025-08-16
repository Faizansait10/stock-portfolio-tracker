package com.faizan.stocktrackeroracle.controller;

import com.faizan.stocktrackeroracle.model.Stock;
import com.faizan.stocktrackeroracle.repository.StockRepository;
import com.faizan.stocktrackeroracle.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private StockDataService stockDataService;

    // Your new API key
    private static final String API_KEY = "LSJOTOVU6GC73Y53";

    @PostMapping("/add")
    public Stock addStock(@RequestBody Stock stock) {
        return stockRepository.save(stock);
    }

    @GetMapping("/all")
    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    @GetMapping("/live/{symbol}")
    public String getLiveStockData(@PathVariable String symbol) {
        return stockDataService.getRealTimeStockData(symbol, API_KEY);
    }
}