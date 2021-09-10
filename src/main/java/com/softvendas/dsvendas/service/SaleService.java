package com.softvendas.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softvendas.dsvendas.dto.SaleDTO;
import com.softvendas.dsvendas.dto.SaleSuccessDTO;
import com.softvendas.dsvendas.dto.SaleSumDTO;
import com.softvendas.dsvendas.entities.Sale;
import com.softvendas.dsvendas.repositories.SaleRepository;
import com.softvendas.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true) // Anotação utilizada para informar que esta transação não necessita realizar o travamento do banco, pois apenas é realizada a leitura dos dados
	public Page<SaleDTO> findAll(Pageable pageable){
		
		sellerRepository.findAll();
		
		Page<Sale> response = saleRepository.findAll(pageable);
		
		return response.map(sale -> new SaleDTO(sale));
		
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return saleRepository.successGroupBySeller();
	}
	
}
