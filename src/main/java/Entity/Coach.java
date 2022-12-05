package Entity;

import Football.IAction;

public class Coach extends Person implements IAction {
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

    @Override
    public String action() {
        return " Start coaching...";
    }
}
