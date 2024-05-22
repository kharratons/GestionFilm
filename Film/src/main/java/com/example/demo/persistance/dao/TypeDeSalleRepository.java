package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.persistance.entities.TypeDeSalle;
public interface TypeDeSalleRepository extends JpaRepository <TypeDeSalle,Long> {

	

    @Query(value = "select count(*) from TypeDeSalle",nativeQuery = true)
    int getQuantityOfTypeDeSalle();
    @Query(value = "select * from TypeDeSalle where id= :id",nativeQuery = true)
    TypeDeSalle getTypeDeSalleByIdTypeDeSalle(@Param("id") Long id);
}
