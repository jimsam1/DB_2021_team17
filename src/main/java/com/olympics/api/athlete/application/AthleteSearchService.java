package com.olympics.api.athlete.application;

import com.olympics.api.athlete.adapter.out.AthleteAdapter;
import com.olympics.api.athlete.domain.Athlete;
import com.olympics.entity.AthleteEntity;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AthleteSearchService {
    private final AthleteAdapter athleteAdapter;

    public List<AthleteEntity> getAthletesByTeam(String team){
        return athleteAdapter.getAthletesByTeam(team);
    }

//    @Mapper
//    abstract static class AthleteSearchServiceMapper{
//        private static final AthleteSearchServiceMapper INSTANCE = Mappers.getMapper(AthleteSearchServiceMapper.class);
//
//        public abstract Athlete toDomain(AthleteEntity entity);
//    }
}
