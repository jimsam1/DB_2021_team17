package com.olympics.api.sport.adapter.in.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SportSearchByStadiumAndDateResponse {
    private String sportName;

    private String stadiumName;
}
