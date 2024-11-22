package org.schedule.schedule1.repository;

import org.schedule.schedule1.model.ProgramaFormacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaFormacionRepository extends JpaRepository<ProgramaFormacion, Integer> {
}