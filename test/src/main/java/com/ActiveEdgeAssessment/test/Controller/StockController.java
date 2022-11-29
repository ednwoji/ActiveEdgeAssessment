package com.ActiveEdgeAssessment.test.Controller;


import com.ActiveEdgeAssessment.test.Model.StockModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ActiveEdgeAssessment.test.Service.StockService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/stocks")
    public StockModel AddStock(@RequestBody @Valid StockModel stockModel) {

    return stockService.addStock(stockModel);

    }

    @GetMapping("/stocks")
    public List<StockModel> findAll() {

        return stockService.findAll();
    }



    @GetMapping("/stocks/{id}")
    public Optional<StockModel> fetchStockById(@PathVariable("id") Long id) {

        return stockService.fetchStockById(id);


    }
}
