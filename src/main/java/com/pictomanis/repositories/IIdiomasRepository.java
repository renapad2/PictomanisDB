package com.pictomanis.repositories;

import com.pictomanis.entities.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIdiomasRepository extends JpaRepository<Idiomas,Integer> {
}
