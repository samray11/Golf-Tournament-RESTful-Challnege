package com.example.demo;
import javax.persistence.*;
@Entity
public class Golf_tournament_type_1 {
    @Id
    @GeneratedValue
    private int tournamentID;
    @Column
    private String tournamentName;
    @Column
    private String forecast;
    @Column
    private String courseName;
    @Column
    private String countryCode;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @Column
    private int roundCount;

    // get and set tournament ID
    public void setTournamentID(int x){
        tournamentID = x;
    }
    public int getTournamentID(){
        return tournamentID;
    }

    // get and set tournament name
    public void setTournamentName(String x){
        tournamentName = x;
    } 
    
    public String getTournamentName(){
        return tournamentName;
    } 
    
    //get and set forecast
    public void setForecast(String x){
        forecast = x;
    }   

    public String getForecast(){
        return forecast;
    } 
    
    //get and set course name
    public void setCourseName(String x){
        courseName = x;
    }   

    public String getCourseName(){
        return courseName;
    } 

    //get and set country code
    public void setCountryCode(String x){
        countryCode = x;
    }   

    public String getCountryCode(){
        return countryCode;
    } 

    //get and set start date
    public void setStartDate(String x){
        startDate = x;
    }   

    public String getStartDate(){
        return startDate;
    } 
    //get and set end date
    public void setEndDate(String x){
        endDate = x;
    }   

    public String getEndDate(){
        return endDate;
    } 
    //get and set round count
    public void setRoundCount(int x){
        roundCount = x;
    }   

    public int getRoundCount(){
        return roundCount;
    } 
}
