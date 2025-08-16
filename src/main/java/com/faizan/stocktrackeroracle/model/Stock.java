package com.faizan.stocktrackeroracle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    private String symbol;
    private String name;

    // Default constructor is required by JPA/Hibernate for object mapping
    public Stock() {}

    // Constructor for creating new Stock objects in your code
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Getters and setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}