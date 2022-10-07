package racingcar.domain;

public class CarNumber {
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 9;
    private int number;

    public CarNumber(String number) {
        validationNumber(number);
        this.number = getParseInt(number);
    }

    public int getNumber() {
        return number;
    }

    public static void validationNumber(String number) {
        isNullOrEmptyCheck(number);
        int parsingNumber = getParseInt(number);
        if (parsingNumber < MIN_NUMBER || parsingNumber > MAX_NUMBER) {
            throw new IllegalArgumentException("[ERROR] 숫자의 범위는 0부터 9까지 입니다.");
        }
    }

    private static int getParseInt(String number) {
        return Integer.parseInt(number);
    }

    private static boolean isNullOrEmptyCheck(String str) {
        return str == null || str == "";
    }
}
