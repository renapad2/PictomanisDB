package com.pictomanis.repositories;

import com.pictomanis.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMembershipRepository extends JpaRepository<Membership,Integer> {
}
