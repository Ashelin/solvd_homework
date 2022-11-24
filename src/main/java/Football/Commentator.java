package Football;

public class Commentator extends Person {
    private String broadcast;
    public Commentator(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Commentator(String firstName, String lastName, String broadcast) {
        super(firstName, lastName);
        this.broadcast = broadcast;
    }
    public String getBroadcast() {
        return broadcast;
    }
    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }
}
