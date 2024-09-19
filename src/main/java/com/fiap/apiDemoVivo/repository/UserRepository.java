package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
   
}
