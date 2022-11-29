package com.ActiveEdgeAssessment.test.Service;

import com.ActiveEdgeAssessment.test.Model.StockModel;
import com.ActiveEdgeAssessment.test.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;
    @Override
    public StockModel addStock(StockModel stockModel) {

        stockModel.setCreateDate(LocalDateTime.now());
        stockModel.setLastUpdate(LocalDateTime.now());
        return stockRepository.save(stockModel);
    }

    @Override
    public List<StockModel> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Optional<StockModel> fetchStockById(Long id) {
        return stockRepository.findById(id);
    }
}
