package Football;

public class Score {
    private int scoreTeamOne;
    private int scoreTeamTwo;

    public Score(int scoreTeamOne, int scoreTeamTwo) {
        this.scoreTeamOne = scoreTeamOne;
        this.scoreTeamTwo = scoreTeamTwo;
    }

    public int getScoreTeamOne() {
        return scoreTeamOne;
    }

    public void setScoreTeamOne(int scoreTeamOne) {
        this.scoreTeamOne = scoreTeamOne;
    }

    public int getScoreTeamTwo() {
        return scoreTeamTwo;
    }

    public void setScoreTeamTwo(int scoreTeamTwo) {
        this.scoreTeamTwo = scoreTeamTwo;
    }
}
