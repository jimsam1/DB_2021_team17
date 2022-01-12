package com.olympics.api.sport.adapter.out;

import com.olympics.api.sport.adapter.in.dto.SportSearchRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchResponse;
import com.olympics.entity.SportEntity;
import com.olympics.repository.SportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class SportAdapter {
    private final SportRepository sportRepository;

    public List<SportSearchResponse> sportSearch(SportSearchRequest request){
        return sportRepository.findSportByStadiumAndDate(request.getStadium(), request.getDate())
                .stream()
                .map(t-> SportSearchResponse.builder()
                        .sportName(t.get(1).toString())
                        .stadiumName(t.get(0).toString())
                        .build())
                .collect(Collectors.toList());
    }
}
