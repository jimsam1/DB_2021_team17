package com.olympics.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "team")
@Data
public class TeamEntity {
    @Column(name = "country")
    private String isCountry;

    @Id
    private String team_name;
}
