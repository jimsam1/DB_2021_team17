package com.olympics.api.sport.adapter.in.dto;

import lombok.Data;

@Data
public class SportSearchBySponsorRequest {
    public String sponsor;

    public String year;

    public String season;
}
