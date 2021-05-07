package com.emerson.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emerson.dsvendas.dto.SalesDTO;
import com.emerson.dsvendas.entities.Sales;
import com.emerson.dsvendas.repositories.SalesRepository;
import com.emerson.dsvendas.repositories.SellerRepository;

@Service
public class SalesService {
	@Autowired
	private SalesRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SalesDTO> findAll(Pageable pageable) {
	sellerRepository.findAll();	
	Page<Sales> result=repository.findAll(pageable);
	return result.map(x-> new SalesDTO(x));
	}	
}
