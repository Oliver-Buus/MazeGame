package model;

public class Player {
    private int id;
    private String name;
    private Location location;
    private int points;
    private String direction;

    public Player(int id, String name, Location location, int points, String direction) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.points = points;
        this.direction = direction;
    }

    public void updatePlayerLocation(Location newLocation, String newDirection) {
        location = newLocation;
        direction = newDirection;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
