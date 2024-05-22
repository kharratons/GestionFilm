package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.example.demo.persistance.entities.Realisateur;
public interface RealisateurRepository extends JpaRepository <Realisateur,Long> {
	Realisateur findByNom(String nom);
	

    @Query(value = "select count(*) from Realisateur",nativeQuery = true)
    int getQuantityOfRealisateur();
    @Query(value = "select * from Realisateur where id= :id",nativeQuery = true)
    Realisateur getRealisateurByIdRealisateur(@Param("id") Long id);
}
