package com.pictomanis.repositories;

import com.pictomanis.entities.Rol;
import com.pictomanis.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    @Query("from Rol u where u.nameRol like %:nameRol")
    List<Rol> findName(@Param("nameRol") String nameRol);
}
