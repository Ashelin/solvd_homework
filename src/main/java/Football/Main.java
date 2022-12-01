package Football;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(29, 5, 1985);
        Score score = new Score(2, 1);
        GameController gameController = new GameController();
        showBoard(score, date);
        gameController.changeScore(2, 2, score);
        showBoard(score, date);
        gameController.changeDate(22, 12, 1899, date);
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
