package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.PricesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PricesRepository extends JpaRepository<PricesModel, Long> {
   
}
