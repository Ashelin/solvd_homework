package Football;

public class Stadium {
    private String name;
    private String country;
    private int stadiumCapacity;

    public Stadium(String name, String country, int stadiumCapacity) {
        this.name = name;
        this.country = country;
        this.stadiumCapacity = stadiumCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }
}
