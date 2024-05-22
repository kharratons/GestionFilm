package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.persistance.entities.Programme;
import com.example.demo.persistance.entities.Programme;
public interface ProgrammeRepository extends JpaRepository <Programme,Long>{

    @Query(value = "select count(*) from Programme",nativeQuery = true)
    int getQuantityOfProgramme();
    @Query(value = "select * from Programme where id= :id",nativeQuery = true)
    Programme getProgrammeByIdProgramme(@Param("id") Long id);
}
