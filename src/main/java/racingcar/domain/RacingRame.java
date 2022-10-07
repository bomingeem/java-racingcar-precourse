package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class RacingRame {
    private final Cars cars;
    private final RacingGameRecord racingGameRecord;

    public RacingRame(String names) {
        this.cars = Cars.createCars(names);
        racingGameRecord = new RacingGameRecord(new ArrayList<>());
    }

    public Cars getCars() {
        return cars;
    }

    public RacingGameRecord getRacingGameRecord() {
        return racingGameRecord;
    }

    public void start(int number) {
        while (number-- > 0) {
            for (Car car : cars.getAnswers()) {
                move(car);
                racingGameRecord.addCars(cars);
            }
        }
    }

    private void move(Car car) {
        car.move(Randoms.pickNumberInRange(0, 9));
    }
}
