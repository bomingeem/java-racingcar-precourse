package racingcar.domain;

import java.util.List;

public class Cars {

    public static GameResult play(List<Car> cars) {
        return new GameResult(cars.get(1).getName());
    }
}
