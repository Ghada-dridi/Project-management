package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.ClientReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientReviewRepository extends JpaRepository<ClientReview,Long> {
}
