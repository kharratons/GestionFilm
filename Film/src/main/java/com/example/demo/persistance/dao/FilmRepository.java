package com.example.demo.persistance.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.demo.persistance.entities.Film;
public interface FilmRepository extends JpaRepository <Film,Long> {
	Film findByTitre(String titre);
	@Query(value = "select count(*) from Film",nativeQuery = true)
    int getQuantityOfFilm();
    @Query(value = "select * from Film where id= :id",nativeQuery = true)
    Film getFilmByIdFilm(@Param("id") Long id);
}
