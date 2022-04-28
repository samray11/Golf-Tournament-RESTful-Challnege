package com.example.demo;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Golf_tournament_type_2 {
    @Id
    @GeneratedValue
    private UUID tournamentUUID;
    @Column
    private String golfCourse;
    @Column
    private String competitionName;
    @Column
    private String hostCountry;
    @Column
    private String epochStart;
    @Column
    private String epochFinish;
    @Column
    private int rounds;
    @Column
    private int playerCount;

    // get and set uuid
    public UUID getTournamentUUID() {
        return tournamentUUID;
    }

    public void setTournamentUUID(UUID x) {
        tournamentUUID = x;
    }

    // get and set golf course
    public String getGolfCourse() {
        return golfCourse;
    }

    public void setGolfCourse(String x) {
        golfCourse = x;
    }

    // get and set competition name
    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String x) {
        competitionName = x;
    }

    // get and set host country
    public String getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(String x) {
        hostCountry = x;
    }

    // get and set epoch start
    public String getEpochStart() {
        return epochStart;
    }

    public void setEpochStart(String x) {
        epochStart = x;
    }

    // get and set epoch finish

    public String getEpochFinish() {
        return epochFinish;
    }

    public void setEpochFinish(String x) {
        epochFinish = x;
    }

    // get and set rounds

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int x) {
        rounds = x;
    }

    // get and set player count

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int x) {
        playerCount = x;
    }
}
