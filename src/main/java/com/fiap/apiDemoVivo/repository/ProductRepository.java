package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
   
}
