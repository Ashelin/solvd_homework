package Football;

import Controllers.GameController;
import Entity.Coach;
import Entity.Player;
import Enums.PlayerRole;
import Exceptions.NotNegativeDateException;
import Exceptions.NotNegativeScoreException;
import Interfaces.IAction;

public class Main {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        Score score = new Score(2, 1);
        Date date = new Date(29, 5, 1985);
        showBoard(score,date);
        try {
            gameController.changeScore(-2, 2, score);
        } catch (NotNegativeScoreException e) {
            System.out.println("error happened: " + e.getMessage());
            score.setScoreTeamOne(0);
            score.setScoreTeamTwo(0);
        }
        try {
            gameController.changeDate(-1, 12, 1899, date);
        } catch (NotNegativeDateException e1) {
            System.out.println("error happened: " + e1.getMessage());
            date.setDay(0);
            date.setMonth(0);
            date.setYear(0);
        }
        showBoard(score,date);
    }

    public static void showBoard(Score score, Date date) {
        IAction coachLiverpool = new Coach("Joseph", "Fagan", "Liverpool");
        IAction coachJuventus = new Coach("Giovanni", "Trapattoni", "Juventus");
        IAction player = new Player("Leonardo", "Bonnuchi", PlayerRole.CAPTAIN);

        League league = new League("Champions league", "Europe");

        FootballTeam liverpool = new FootballTeam("Liverpool", 1892, "England", coachLiverpool);
        FootballTeam juventus = new FootballTeam("Juventus", 1897, "Italy", coachJuventus);

        Stadium stadium = new Stadium("King Baudouin Stadium", "Belgium", 50_093);

        Goal goal = new Goal("Platini", 58);

        System.out.println(league.getName());
        System.out.println(juventus.getTeamName() + " " + score.getScoreTeamOne() + ":" + score.getScoreTeamTwo() + " " + liverpool.getTeamName());
        System.out.println(goal.getPlayerName() + " " + goal.getGoalTime());
        System.out.println(stadium.getName());
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
        System.out.println(player);
    }
}
