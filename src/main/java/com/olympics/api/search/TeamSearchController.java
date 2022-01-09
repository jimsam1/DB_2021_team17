package com.olympics.api.search;

import com.olympics.entity.TeamEntity;
import com.olympics.repository.TeamRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TeamSearchController {
    private final TeamRepository teamRepository;

    @GetMapping("/team")
    public List<TeamEntity> findAllTeams(){
        return teamRepository.findAll();
    }
}
