package com.olympics.entity;

import com.olympics.entity.enums.SeasonEnum;
import com.olympics.entity.enums.SportTypeEnum;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "sport")
public class SportEntity {
    @Id
    private String sportName;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('individual','group')")
    private SportTypeEnum type;

    private int olympicsYear;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('summer','winter')")
    private SeasonEnum olympicsSeason;

    private LocalDate sportDate;
}
