package com.evaldo91.avalia.domain.professor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    UserDetails  findByEmail(String subject);
}
