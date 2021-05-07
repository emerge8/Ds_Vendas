package com.emerson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.dsvendas.entities.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long>{

}
