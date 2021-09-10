package com.softvendas.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softvendas.dsvendas.dto.SellerDTO;
import com.softvendas.dsvendas.entities.Seller;
import com.softvendas.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> findAll(){
		List<Seller> response = sellerRepository.findAll();
		
		return response.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList()); // Convertendo a lista de Seller para uma lista de SellerDTO
		
	}
	
}
