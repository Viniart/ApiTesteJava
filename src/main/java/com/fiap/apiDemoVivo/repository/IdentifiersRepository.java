package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.IdentifiersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IdentifiersRepository extends JpaRepository<IdentifiersModel, Long> {
   
}
