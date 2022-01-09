package com.olympics.api.athlete.adapter.in;

import com.olympics.api.athlete.application.AthleteSearchService;
import com.olympics.api.athlete.domain.Athlete;
import com.olympics.entity.AthleteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AthleteSearchController {
    private final AthleteSearchService athleteSearchService;

    @GetMapping("/athlete/{team}")
    public List<AthleteEntity> getAthletesByTeam(@PathVariable(name = "team") String team){
        return athleteSearchService.getAthletesByTeam(team);
    }
}
