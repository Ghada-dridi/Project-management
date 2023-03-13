package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.ExternProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternProjectRepository extends JpaRepository<ExternProject,Long> {

}
