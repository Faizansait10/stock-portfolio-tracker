package com.faizan.stocktrackeroracle.controller;

import com.faizan.stocktrackeroracle.model.Portfolio;
import com.faizan.stocktrackeroracle.model.User;
import com.faizan.stocktrackeroracle.repository.PortfolioRepository;
import com.faizan.stocktrackeroracle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public ResponseEntity<Portfolio> addStockToPortfolio(@RequestBody Portfolio portfolio) {
        Optional<User> userOptional = userRepository.findById(portfolio.getUser().getId());
        if (userOptional.isPresent()) {
            portfolio.setUser(userOptional.get());
            return ResponseEntity.ok(portfolioRepository.save(portfolio));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/{userId}")
    public List<Portfolio> getUserPortfolio(@PathVariable Long userId) {
        return portfolioRepository.findByUserId(userId);
    }
}