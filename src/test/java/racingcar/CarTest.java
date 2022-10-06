package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.CarNumber;
import racingcar.domain.CarStatus;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("TEST", 1);
    }

    @Test
    void validationNumberTest() {
        boolean result = CarNumber.validationNumber(9);
        assertThat(result).isTrue();
    }

    @Test
    void validationNameTest() {
        boolean result = CarName.validationName();
        assertThat(result).isTrue();
    }

    @Test
    void move() {
        CarStatus status = car.move(new Car("A", 8));
        assertThat(status).isEqualTo(CarStatus.MOVE);
    }

    @Test
    void stop() {
        CarStatus status = car.move(new Car("B", 2));
        assertThat(status).isEqualTo(CarStatus.STOP);
    }

}
