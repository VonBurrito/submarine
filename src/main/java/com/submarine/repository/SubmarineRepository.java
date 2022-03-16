package com.submarine.repository;

import com.submarine.model.Submarine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmarineRepository extends JpaRepository<Submarine, Long> {
}
