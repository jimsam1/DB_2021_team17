package com.olympics.api.sport.adapter.out;

import com.olympics.api.sport.adapter.in.dto.SportSearchBySponsorRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchBySponsorResponse;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchByStadiumAndDateResponse;
import com.olympics.repository.SportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class SportAdapter {
    private final SportRepository sportRepository;

    public List<SportSearchByStadiumAndDateResponse> sportSearchByStadiumAndDate(SportSearchByStadiumAndDateRequest request){
        return sportRepository.findSportByStadiumAndDate(request.getStadium(), request.getDate())
                .stream()
                .map(t-> SportSearchByStadiumAndDateResponse.builder()
                        .sportName(t.get(1).toString())
                        .stadiumName(t.get(0).toString())
                        .build())
                .collect(Collectors.toList());
    }

    public List<String> sportSearchBySponsor(SportSearchBySponsorRequest request){
        return sportRepository.findSportBySponsorAndYearAndSeason(request.getSponsor(), request.getYear(), request.getSeason());
    }
}
