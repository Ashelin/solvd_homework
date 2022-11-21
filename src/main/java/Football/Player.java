package Football;

public class Player {
    private String firstName;
    private String lastName;
    private String role;
    private int number;

    public Player(String firstName, String lastName, int number, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
