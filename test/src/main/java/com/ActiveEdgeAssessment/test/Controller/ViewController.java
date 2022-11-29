package com.ActiveEdgeAssessment.test.Controller;

import com.ActiveEdgeAssessment.test.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class ViewController {

    @Autowired
    private StockRepository stockRepository;

    @GetMapping("/list")
    public ModelAndView index() {

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("Todo", stockRepository.findAll());
        return modelAndView;
    }
}
