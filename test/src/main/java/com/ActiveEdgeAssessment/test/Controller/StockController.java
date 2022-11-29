package com.ActiveEdgeAssessment.test.Controller;


import com.ActiveEdgeAssessment.test.Model.StockModel;
import com.ActiveEdgeAssessment.test.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.ActiveEdgeAssessment.test.Service.StockService;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api")
@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private StockRepository stockRepository;

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


    @PutMapping("/stocks/{id}")
    public StockModel updateStock(@PathVariable("id") Long id, @RequestBody StockModel stockModel){

        return stockService.updateStock(id, stockModel);
    }


}
