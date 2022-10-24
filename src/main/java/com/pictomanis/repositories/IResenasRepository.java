package com.pictomanis.repositories;

import com.pictomanis.entities.Resenas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IResenasRepository extends JpaRepository<Resenas,Integer> {
    @Query("from Resenas r where r.nameResenas like %:nameResenas%")
    List<Resenas> findName(@Param("nameResenas") String nameResenas);

}
