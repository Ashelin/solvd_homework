package Enums;

public enum PlayerRole {
    GOALKEEPER("Goalkeeper"), DEFENDER("Defender"), STRIKER("Striker"), CAPTAIN("Captain");

    final String name;

    PlayerRole(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
