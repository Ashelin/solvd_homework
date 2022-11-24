package Football;

public class Coach extends Person {
    private String team;
    public Coach(String firstName, String lastName, String team) {
        super(firstName, lastName);
        this.team = team;
    }
    public Coach(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
}
