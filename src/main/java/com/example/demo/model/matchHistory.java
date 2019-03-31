package com.example.demo.model;

public class matchHistory {
    private Integer Id;
    private Integer sourceId;
    private String hostTeamName;
    private String guestTeamName;
    private Integer hostScore;
    private Integer guestScore;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
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

    public Integer getHostScore() {
        return hostScore;
    }

    public void setHostScore(Integer hostScore) {
        this.hostScore = hostScore;
    }

    public Integer getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Integer guestScore) {
        this.guestScore = guestScore;
    }

    @Override
    public String toString() {
        return "matchHistory{" +
                "Id=" + Id +
                ", sourceId=" + sourceId +
                ", hostTeamName='" + hostTeamName + '\'' +
                ", guestTeamName='" + guestTeamName + '\'' +
                ", hostScore=" + hostScore +
                ", guestScore=" + guestScore +
                '}';
    }
}
