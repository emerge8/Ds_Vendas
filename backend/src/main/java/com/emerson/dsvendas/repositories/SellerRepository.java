package com.emerson.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
