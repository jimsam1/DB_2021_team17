package com.olympics.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "athlete")
public class AthleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int athleteId;

    private String athleteName;

    private LocalDateTime birthdate;

    private String gender;

    private float height;

    private String teamTeamName;

    private float weight;
}
