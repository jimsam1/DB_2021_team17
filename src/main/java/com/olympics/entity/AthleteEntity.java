package com.olympics.entity;

import com.olympics.entity.enums.GenderEnum;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "athlete")
public class AthleteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int athleteId;

    private String athleteName;

    private LocalDateTime birthdate;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('male','female')")
    private GenderEnum gender;

    @Column(columnDefinition = "decimal(3,2)")
    private float height;

    private String teamTeamName;

    @Column(columnDefinition = "decimal(5,2)")
    private float weight;
}
