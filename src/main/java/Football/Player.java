package Football;

public class Player extends Person implements IAction {
    private PlayerRole role;
    private int number;

    public Player(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Player(String firstName, String lastName, PlayerRole role) {
        super(firstName, lastName);
        this.role = role;
    }

    public Player(String firstName, String lastName, PlayerRole role, int number) {
        super(firstName, lastName);
        this.role = role;
        this.number = number;
    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        this.role = role;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String action() {
        return "Starts playing...";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getRole();
    }
}
