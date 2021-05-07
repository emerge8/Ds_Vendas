package com.emerson.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emerson.dsvendas.dto.SalesDTO;
import com.emerson.dsvendas.dto.SellerDTO;
import com.emerson.dsvendas.entities.Sales;
import com.emerson.dsvendas.repositories.SalesRepository;

@Service
public class SellerService {
	@Autowired
	private SalesRepository repository;
	
	public Page<SalesDTO> findAll(Pageable pageable) {
	Page<Sales> result=repository.findAll(pageable);
	return result.map(x-> new SalesDTO(x));
	}

	public List<SellerDTO> findAll() {
		return null;
	}	
}
