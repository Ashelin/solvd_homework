package Football;

public class Main {
    public static void main(String[] args) {
        footballMatch();
    }

    public static void footballMatch() {
        Coach coachLiverpool = new Coach("Joseph", "Fagan");
        Coach coachJuventus = new Coach("Giovanni", "Trapattoni");

        FootballTeam liverpool = new FootballTeam("Liverpool", 1892, "England");
        FootballTeam juventus = new FootballTeam("Juventus", 1897, "Italy");

        Stadium stadium = new Stadium("King Baudouin Stadium", "Belgium", 50_093);

        Date date = new Date(29, 05, 1985);

        Score score = new Score(1, 0);

        Goal goal = new Goal("Platini", 58);

        System.out.println(juventus.getTeamName() + " " + score.getScoreTeamOne() + ":" + score.getScoreTeamTwo() + " " + liverpool.getTeamName());
        System.out.println(goal.getPlayerName() + " " + goal.getGoalTime());
        System.out.println(stadium.getName());
        System.out.println(date.getDay() + "." + date.getMonth() + "." + date.getYear());
    }
}
