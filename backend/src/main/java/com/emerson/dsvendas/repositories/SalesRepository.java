package com.emerson.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emerson.dsvendas.dto.SalesSuccessDTO;
import com.emerson.dsvendas.dto.SalesSumDTO;
import com.emerson.dsvendas.entities.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {

	@Query("SELECT new com.emerson.dsvendas.dto.SalesSumDTO(obj.seller, SUM(obj.amount)) "
			+ " FROM Sales AS obj GROUP BY obj.seller")
	List<SalesSumDTO> amountGrupedBySeller();
	
	@Query("SELECT new com.emerson.dsvendas.dto.SalesSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
		+ " FROM Sales AS obj GROUP BY obj.seller") 
	List<SalesSuccessDTO> successGrupedBySeller();  
}
