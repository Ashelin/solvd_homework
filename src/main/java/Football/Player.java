package Football;

public class Player extends Person {
    private String role;
    private int number;
    public Player(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Player(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    public Player(String firstName, String lastName, String role, int number) {
        super(firstName, lastName);
        this.role = role;
        this.number = number;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
