package com.olympics.api.athlete.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Athlete {
    private String athleteName;

    private LocalDateTime birthdate;

    private String gender;

    private float height;

    private String teamTeamName;

    private float weight;
}
