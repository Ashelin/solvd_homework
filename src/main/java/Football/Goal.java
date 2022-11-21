package Football;

public class Goal {
    private String playerName;
    private int goalTime;

    public Goal(String playerName, int goalTime) {
        this.playerName = playerName;
        this.goalTime = goalTime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(int goalTime) {
        this.goalTime = goalTime;
    }
}
