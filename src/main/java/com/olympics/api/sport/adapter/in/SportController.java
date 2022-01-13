package com.olympics.api.sport.adapter.in;

import com.olympics.api.sport.adapter.in.dto.SportSearchBySponsorRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateResponse;
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
    public List<SportSearchByStadiumAndDateResponse> sportSearchByStadiumAndDate(@RequestBody SportSearchByStadiumAndDateRequest request){

        System.out.println("Reached here");
        System.out.println(sportService.sportSearchByStadiumAndDate(request));
        return sportService.sportSearchByStadiumAndDate(request);
    }

    @PostMapping("/sport/search-by-sponsor")
    @CrossOrigin("http://localhost:3000")
    public List<String> sportSearchBySponsor(@RequestBody SportSearchBySponsorRequest request){

        System.out.println("Reached here");
        System.out.println(sportService.sportSearchBySponsor(request));
        return sportService.sportSearchBySponsor(request);
    }
}
