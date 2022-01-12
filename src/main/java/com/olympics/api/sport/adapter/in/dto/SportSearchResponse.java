package com.olympics.api.sport.adapter.in.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SportSearchResponse {
    private String sportName;

    private String stadiumName;
}
