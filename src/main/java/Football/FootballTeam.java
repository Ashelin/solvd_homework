package Football;

import Interfaces.IAction;

public class FootballTeam {
    private String teamName;
    private int estYear;
    private String teamCountry;
    private IAction coach;

    public FootballTeam(String teamName, int estYear, String teamCountry, IAction coach) {
        this.teamName = teamName;
        this.estYear = estYear;
        this.teamCountry = teamCountry;
        this.coach = coach;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getEstYear() {
        return estYear;
    }

    public void setEstYear(int estYear) {
        this.estYear = estYear;
    }

    public String getTeamCountry() {
        return teamCountry;
    }

    public void setTeamCountry(String teamCountry) {
        this.teamCountry = teamCountry;
    }

    public IAction getCoach() {
        return coach;
    }

    public void setCoach(IAction coach) {
        this.coach = coach;
    }
}

