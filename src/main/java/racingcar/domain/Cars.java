package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> answers;

    public Cars(List<Car> answers) {
        this.answers = answers;
    }

    public List<Car> getAnswers() {
        return answers;
    }

    public static Cars createCars(String names) {
        String[] splitNames = names.split(",");
        return new Cars(mapCar(splitNames));
    }

    private static List<Car> mapCar(String[] splitNames) {
        List<Car> cars = new ArrayList<>();
        for (String splitName : splitNames) {
            cars.add(Car.createCar(splitName));
        }
        return cars;
    }
}
