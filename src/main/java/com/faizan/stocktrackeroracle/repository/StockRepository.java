package com.faizan.stocktrackeroracle.repository;

import com.faizan.stocktrackeroracle.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> { }