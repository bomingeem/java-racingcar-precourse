package racingcar.domain;

public class Car {
    public static final int MOVE_MIN_VALUE = 4;
    private String name;
    private int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public CarStatus move(Car car) {
        return matchCarDistance(car.distance) ? CarStatus.MOVE : CarStatus.STOP;
    }

    private boolean matchCarDistance(int distance) {
        return distance >= MOVE_MIN_VALUE;
    }
}
