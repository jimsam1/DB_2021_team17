package com.olympics.repository;

import com.olympics.entity.SportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Tuple;
import java.util.List;

public interface SportRepository extends JpaRepository<SportEntity, String> {
    @Query(value = "SELECT stadium_has_sport.Stadium_Stadium_Name as Stadium_Name, stadium_has_sport.Sport_Sport_Name as Sport_Name FROM sport JOIN stadium_has_sport ON stadium_has_sport.Sport_Olympics_Year = sport.Olympics_Year AND stadium_has_sport.Sport_Olympics_Season = sport.Olympics_Season AND stadium_has_sport.Sport_Sport_Name = sport.Sport_Name WHERE sport.Sport_Date = :date AND stadium_has_sport.Stadium_Stadium_Name = :stadium", nativeQuery = true)
    List<Tuple> findSportByStadiumAndDate(String stadium, String date);

    @Query(value = "SELECT DISTINCT(athlete_has_sport.Sport_Sport_Name) as Sport_Name FROM athlete_has_sponsor JOIN athlete_has_sport ON athlete_has_sponsor.Athlete_Athlete_id = athlete_has_sport.Athlete_Athlete_id WHERE athlete_has_sport.Sport_Olympics_Year = :year AND athlete_has_sport.Sport_Olympics_Season = :season AND athlete_has_sponsor.Sponsor_Sponsor_Name = :sponsor", nativeQuery = true)
    List<String> findSportBySponsorAndYearAndSeason(String sponsor, String year, String season);
}
