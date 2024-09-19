package com.fiap.apiDemoVivo.repository;

import com.fiap.apiDemoVivo.model.TagsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagsRepository extends JpaRepository<TagsModel, Long> {
   
}
