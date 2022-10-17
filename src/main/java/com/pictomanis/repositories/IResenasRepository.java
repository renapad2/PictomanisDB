package com.pictomanis.repositories;

import com.pictomanis.entities.Resenas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResenasRepository extends JpaRepository<Resenas,Integer> {
}
