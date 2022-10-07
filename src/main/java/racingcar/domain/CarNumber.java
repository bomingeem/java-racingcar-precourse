package racingcar.domain;

public class CarNumber {
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 9;
    private int number;

    public CarNumber(int number) {
        validationNumber(number);
        this.number = number;
    }

    public static void validationNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 숫자의 범위는 0부터 9까지 입니다.");
        }
    }
}
