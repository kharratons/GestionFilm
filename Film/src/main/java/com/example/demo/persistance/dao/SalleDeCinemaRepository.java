package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.SalleDeCinema;
public interface SalleDeCinemaRepository extends JpaRepository <SalleDeCinema,Long> {
	SalleDeCinema findByNom(String nom);
	

    @Query(value = "select count(*) from SalleDeCinema",nativeQuery = true)
    int getQuantityOfSalleDeCinema();
    @Query(value = "select * from SalleDeCinema where id= :id",nativeQuery = true)
    SalleDeCinema getSalleDeCinemaByIdSalleDeCinema(@Param("id") Long id);
}
