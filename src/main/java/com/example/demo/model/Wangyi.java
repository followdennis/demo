package com.example.demo.model;

public class Wangyi {
    private Integer Id;
    private String matchNum;
    private String competitionName;
    private String matchTime;
    private String hostTeamName;
    private String guestTeamName;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMatchNum() {
        return matchNum;
    }

    public void setMatchNum(String matchNum) {
        this.matchNum = matchNum;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public String getHostTeamName() {
        return hostTeamName;
    }

    public void setHostTeamName(String hostTeamName) {
        this.hostTeamName = hostTeamName;
    }

    public String getGuestTeamName() {
        return guestTeamName;
    }

    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName;
    }

    @Override
    public String toString() {
        return "Wangyi{" +
                "Id=" + Id +
                ", matchNum='" + matchNum + '\'' +
                ", competitionName='" + competitionName + '\'' +
                ", matchTime=" + matchTime +
                ", hostTeamName='" + hostTeamName + '\'' +
                ", guestTeamName='" + guestTeamName + '\'' +
                '}';
    }
}
