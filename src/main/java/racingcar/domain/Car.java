package racingcar.domain;

public class Car {

    private String name;
    private int Location;

    public Car(String name, int Location) {
        this.name = name;
        this.Location = Location;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return Location;
    }

    public void move() {
        this.Location++;
    }
}
