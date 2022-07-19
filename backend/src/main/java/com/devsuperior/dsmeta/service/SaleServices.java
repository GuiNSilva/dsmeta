package com.devsuperior.dsmeta.service;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;


@Service
public class SaleServices {
	
	@Autowired
	private SaleRepository repository;		
	
	public Page<Sale>findSales(String minDate, String maxDate,  Pageable pageable){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); // Tratar caso de data em branco na requisição.
		
		LocalDate min = minDate .equals("") ? today.minusDays(365): LocalDate.parse(minDate);
		LocalDate max = maxDate .equals("") ? today: LocalDate.parse(maxDate);//test se data em branco aplicar a data today.
		
		 return repository.findSales(min, max, pageable);
	 	}
}
