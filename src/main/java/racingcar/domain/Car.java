package racingcar.domain;

public class Car {
    public static final int MOVE_MIN_VALUE = 4;
    private CarName name;
    private int distance;

    public Car(CarName name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public static Car createCar(String name) {
        return new Car(new CarName(name), 0);

    }

    public CarName getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void move(int number) {
        if (matchCarDistance(number)) {
            distance++;
        }
    }

    public boolean matchCarDistance(int distance) {
        return distance >= MOVE_MIN_VALUE;
    }
}
