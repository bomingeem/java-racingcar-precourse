package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarNumber;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("TEST", 1);
    }

    @Test
    void 검증() {
        boolean result = CarNumber.inputNumber(9);
        assertThat(result).isTrue();
    }
}
