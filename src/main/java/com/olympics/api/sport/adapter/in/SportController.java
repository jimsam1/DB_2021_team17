package com.olympics.api.sport.adapter.in;

import com.olympics.api.athlete.application.AthleteService;
import com.olympics.api.sport.adapter.in.dto.SportSearchRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchResponse;
import com.olympics.api.sport.application.SportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SportController {
    private final SportService sportService;

    @GetMapping("/sport/search")
    @CrossOrigin("http://localhost:3000")
    public List<SportSearchResponse> sportSearch(@RequestBody SportSearchRequest request){
        return sportService.sportSearch(request);
    }
}
