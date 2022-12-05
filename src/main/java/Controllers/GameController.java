package Controllers;

import Entity.Coach;
import Exceptions.NotNegativeDateException;
import Exceptions.NotNegativeScoreException;
import Exceptions.NotNullException;
import Football.Date;
import Football.FootballTeam;
import Football.IAction;
import Football.Score;

public class GameController {
    public void changeScore(int teamOne, int teamTwo, Score score) throws NotNegativeScoreException {
        if (teamOne < 0 || teamTwo < 0) {
            throw new NotNegativeScoreException("Score cannot be negative");
        }
        score.setScoreTeamOne(teamOne);
        score.setScoreTeamTwo(teamTwo);
    }

    public void changeDate(int day, int month, int year, Date date) throws NotNegativeDateException {
        if (day < 0 || month < 0 || year < 0) {
            throw new NotNegativeDateException("Date cannot be negative");
        }
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
    }

    public void editCoach(String firstName, String lastName, String team, Coach coach) throws NotNullException {
        if ((firstName == null) || (lastName == null) || (team == null) || (coach == null)) {
            throw new NotNullException("Coach cannot be null");
        }
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setTeam(team);
    }

    public void editTeam(String teamName, int estYear, String teamCountry, IAction coach, FootballTeam footballTeam) throws NotNullException {
        if ((teamName == null) || (estYear < 0) || (teamCountry == null) || (coach == null) || (footballTeam == null)) {
            throw new NotNullException("Football team cannot be null");
        }
        footballTeam.setTeamName(teamName);
        footballTeam.setEstYear(estYear);
        footballTeam.setTeamCountry(teamCountry);
        footballTeam.setCoach(coach);
    }
}
