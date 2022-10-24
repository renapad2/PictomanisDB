package com.pictomanis.repositories;

import com.pictomanis.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    @Query("from Rol r where r.rolName like %:rolName%")
    List<Rol> findName(@Param("rolName") String rolName);
}
