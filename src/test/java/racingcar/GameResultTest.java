package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.GameResult;

import java.util.Arrays;

public class GameResultTest {

    @Test
    public void play() {
        GameResult gameResult = Cars.play(Arrays.asList(new Car("A", 3), new Car("B", 5), new Car("C", 8)));
        Assertions.assertThat(gameResult.getUserName()).isEqualTo("B");

    }
}
