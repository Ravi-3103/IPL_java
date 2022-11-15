package com.ipl;

public class Match {
    private int id;
    private int season;
    private String city;
    private String date;
    private String team1;
    private String team2;
    private String toss_winner;
    private String toss_decision;
    private String result;
    private int dl_applied;
    private String winner;
    private int win_by_run;
    private int win_by_wicket;
    private String player_of_match;
    private String venue;
    private String umpire1;
    private String umpire2;

    public Match(int id, int season, String city, String date, String team1, String team2, String toss_winner, String toss_decision, String result, int dl_applied, String winner, int win_by_run, int win_by_wicket, String player_of_match, String venue, String umpire1, String umpire2) {
        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.toss_winner = toss_winner;
        this.toss_decision = toss_decision;
        this.result = result;
        this.dl_applied = dl_applied;
        this.winner = winner;
        this.win_by_run = win_by_run;
        this.win_by_wicket = win_by_wicket;
        this.player_of_match = player_of_match;
        this.venue = venue;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
    }

    public int getId() {
        return id;
    }

    public int getSeason() {
        return season;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getToss_winner() {
        return toss_winner;
    }

    public String getToss_decision() {
        return toss_decision;
    }

    public String getResult() {
        return result;
    }

    public int getDl_applied() {
        return dl_applied;
    }

    public String getWinner() {
        return winner;
    }

    public int getWin_by_run() {
        return win_by_run;
    }

    public int getWin_by_wicket() {
        return win_by_wicket;
    }

    public String getPlayer_of_match() {
        return player_of_match;
    }

    public String getVenue() {
        return venue;
    }

    public String getUmpire1() {
        return umpire1;
    }

    public String getUmpire2() {
        return umpire2;
    }
}
