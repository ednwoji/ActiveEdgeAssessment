package com.ActiveEdgeAssessment.test.Repository;

import com.ActiveEdgeAssessment.test.Model.StockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<StockModel, Long> {
}
