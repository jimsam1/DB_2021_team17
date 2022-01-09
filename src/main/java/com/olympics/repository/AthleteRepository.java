package com.olympics.repository;

import com.olympics.entity.AthleteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository<AthleteEntity, Integer> {
    List<AthleteEntity> findAll();
}
