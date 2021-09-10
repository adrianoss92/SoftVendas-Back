package com.softvendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softvendas.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
