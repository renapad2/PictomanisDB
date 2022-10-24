package com.pictomanis.repositories;

import com.pictomanis.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    List<Rol> findName(String nameRol);
}
