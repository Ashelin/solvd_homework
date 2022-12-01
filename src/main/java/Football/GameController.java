package Football;

public class GameController {
    public void changeScore(int teamOne, int teamTwo, Score score) {
        score.setScoreTeamOne(teamOne);
        score.setScoreTeamTwo(teamTwo);
    }

    public void changeDate(int day, int month, int year, Date date){
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
    }

    public void editCoach(String firstName, String lastName, String team, Coach coach){
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setTeam(team);
    }
}
