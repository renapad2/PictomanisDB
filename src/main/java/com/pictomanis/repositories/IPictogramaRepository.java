package com.pictomanis.repositories;

import com.pictomanis.entities.Pictograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPictogramaRepository extends JpaRepository<Pictograma,Integer> {
}
