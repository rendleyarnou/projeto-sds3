package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccesDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService salesService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> salesDTO = salesService.findAll(pageable);
		return ResponseEntity.ok(salesDTO);
	}
	
	@GetMapping(value = "amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> salesSumDTO = salesService.amountGroupedBySeller();
		return ResponseEntity.ok(salesSumDTO);
	}
	
	@GetMapping(value = "succes-by-seller")
	public ResponseEntity<List<SaleSuccesDTO>> succesGroupedBySeller() {
		List<SaleSuccesDTO> salesSuccesDTO = salesService.succesGroupedBySeller();
		return ResponseEntity.ok(salesSuccesDTO);
	}

}
