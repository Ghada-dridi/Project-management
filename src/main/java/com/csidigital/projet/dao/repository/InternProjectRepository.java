package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.InternProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternProjectRepository extends JpaRepository<InternProject,Long> {
}
