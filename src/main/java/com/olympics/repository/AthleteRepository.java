package com.olympics.repository;

import com.olympics.entity.AthleteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AthleteRepository extends JpaRepository<AthleteEntity, Integer> {
    List<AthleteEntity> findAll();

    @Query("select a from AthleteEntity a " +
            "join TeamEntity t " +
            "on a.teamTeamName = t.teamName " +
            "where t.teamName = :team ")
    List<AthleteEntity> findByTeam(String team);

//    @Query(value = "SELECT athlete.Athlete_Name " +
//            "FROM athlete " +
//            "JOIN team " +
//            "ON athlete.Team_Team_Name = team.Team_Name " +
//            "WHERE Team_Name = :team" , nativeQuery = true)
//    List<AthleteEntity> findByTeamNative(String team);
}
