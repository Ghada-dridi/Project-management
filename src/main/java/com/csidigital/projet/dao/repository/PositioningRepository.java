package com.csidigital.projet.dao.repository;


import com.csidigital.projet.dao.entity.Positioning;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositioningRepository extends JpaRepository<Positioning,Long> {
}
