package com.olympics.api.search;

import com.olympics.entity.AthleteEntity;
import com.olympics.repository.AthleteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AthleteSearchController {
    private final AthleteRepository athleteRepository;

    @CrossOrigin(origins = "*")
    @GetMapping("/athlete")
    public List<AthleteEntity> getAllAthletes(){
        return athleteRepository.findAll();
    }
}
