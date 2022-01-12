package com.olympics.entity;

import com.olympics.entity.enums.IsCountryEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "team")
@Data
public class TeamEntity {
    @Enumerated(EnumType.STRING)
    @Column(name = "country",columnDefinition = "ENUM('yes','no')")
    private IsCountryEnum isCountry;

    @Id
    private String teamName;
}
