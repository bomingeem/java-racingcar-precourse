package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarNumber;
import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private RacingGame racingGame;
    private CarNumber carNumber;

    public void play() {
        InputView.printInputRacingCarNames();
        racingGame = new RacingGame(Console.readLine());
        InputView.printInputTryCount();
        carNumber = new CarNumber(Console.readLine());

        racingGame.start(carNumber.getNumber());
        OutputView.printRacingGameResult(racingGame);
    }
}
