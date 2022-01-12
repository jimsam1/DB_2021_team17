package com.olympics.repository;

import com.olympics.api.sport.adapter.in.dto.SportSearchResponse;
import com.olympics.entity.AthleteEntity;
import com.olympics.entity.SportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Tuple;
import java.time.LocalDateTime;
import java.util.List;

public interface SportRepository extends JpaRepository<SportEntity, String> {
    @Query(value = "SELECT stadium_has_sport.Stadium_Stadium_Name as Stadium_Name, stadium_has_sport.Sport_Sport_Name as Sport_Name FROM sport JOIN stadium_has_sport ON stadium_has_sport.Sport_Olympics_Year = sport.Olympics_Year AND stadium_has_sport.Sport_Olympics_Season = sport.Olympics_Season AND stadium_has_sport.Sport_Sport_Name = sport.Sport_Name WHERE sport.Sport_Date = :date AND stadium_has_sport.Stadium_Stadium_Name = :stadium", nativeQuery = true)
    List<Tuple> findSportByStadiumAndDate(String stadium, String date);
}
