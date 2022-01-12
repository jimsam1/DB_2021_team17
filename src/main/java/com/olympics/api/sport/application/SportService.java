package com.olympics.api.sport.application;

import com.olympics.api.sport.adapter.in.dto.SportSearchRequest;
import com.olympics.api.sport.adapter.in.dto.SportSearchResponse;
import com.olympics.api.sport.adapter.out.SportAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SportService {
    private final SportAdapter sportAdapter;

    public List<SportSearchResponse> sportSearch(SportSearchRequest request){
        return sportAdapter.sportSearch(request);
    }
}
