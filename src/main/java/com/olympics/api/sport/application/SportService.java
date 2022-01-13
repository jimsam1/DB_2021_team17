package com.olympics.api.sport.application;

import com.olympics.api.sport.adapter.in.dto.SportSearchBySponsorRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchBySponsorResponse;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateResponse;
import com.olympics.api.sport.adapter.out.SportAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SportService {
    private final SportAdapter sportAdapter;

    public List<SportSearchByStadiumAndDateResponse> sportSearchByStadiumAndDate(SportSearchByStadiumAndDateRequest request){
        return sportAdapter.sportSearchByStadiumAndDate(request);
    }

    public List<String> sportSearchBySponsor(SportSearchBySponsorRequest request){
        return sportAdapter.sportSearchBySponsor(request);
    }
}
