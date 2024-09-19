package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.DescriptionsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DescriptionsRepository extends JpaRepository<DescriptionsModel, Long> {
   
}
