package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarNumber;
import racingcar.domain.RacingRame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private RacingRame racingRame;
    private CarNumber carNumber;

    public void play() {
        InputView.printInputRacingCarNames();
        racingRame = new RacingRame(Console.readLine());
        InputView.printInputTryCount();
        carNumber = new CarNumber(Console.readLine());
        racingRame.start(carNumber.getNumber());
        OutputView.printRacingGameResult(racingRame);
    }
}
