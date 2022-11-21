package Football;

public class FootballTeam {
    private String teamName;
    private int estYear;
    private String teamCountry;

    public FootballTeam(String teamName, int estYear, String teamCountry) {
        this.teamName = teamName;
        this.estYear = estYear;
        this.teamCountry = teamCountry;
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
}

