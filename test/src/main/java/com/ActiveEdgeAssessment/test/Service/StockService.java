package com.ActiveEdgeAssessment.test.Service;

import com.ActiveEdgeAssessment.test.Model.StockModel;

import java.util.List;
import java.util.Optional;


public interface StockService {
    StockModel addStock(StockModel stockModel);

    List<StockModel> findAll();

    Optional<StockModel> fetchStockById(Long id);

    StockModel updateStock(Long id, StockModel stockModel);
}
