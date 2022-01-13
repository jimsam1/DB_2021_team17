package com.olympics.api.sport.adapter.in;

import com.olympics.api.athlete.application.AthleteService;
import com.olympics.api.sport.adapter.in.dto.SportSearchRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchResponse;
import com.olympics.api.sport.application.SportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SportController {
    private final SportService sportService;

    @PostMapping("/sport/search")
    @CrossOrigin("http://localhost:3000")
    public List<SportSearchResponse> sportSearch(@RequestBody SportSearchRequest request){

        System.out.println("Reached here");
        System.out.println(sportService.sportSearch(request));
        return sportService.sportSearch(request);
    }
}
