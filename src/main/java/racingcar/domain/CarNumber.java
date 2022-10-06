package racingcar.domain;

public class CarNumber {
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 9;
    private int number;

    public CarNumber(int number) {
        this.number = number;
    }

    public static boolean inputNumber(int number) {
        if (number >= MIN_NUMBER && number <= MAX_NUMBER) {
            return true;
        }
        return false;
    }
}
