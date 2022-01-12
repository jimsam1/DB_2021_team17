package com.olympics.api.athlete.adapter.out;

import com.olympics.entity.AthleteEntity;
import com.olympics.repository.AthleteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Repository
public class AthleteAdapter {
    private final AthleteRepository athleteRepository;
    private final EntityManager entityManager;

    public List<AthleteEntity> getAthletesByTeam(String team){
        return athleteRepository.findByTeam(team);
    }
}
