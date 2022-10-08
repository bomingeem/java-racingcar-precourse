package racingcar.utils;

import camp.nextstep.edu.missionutils.Console;

public class CommonUtil {
    public static String inputText() {
        return Console.readLine();
    }

    public static boolean isNullOrEmptyCheck(String str) {
        return str == null || str == "";

    }
}
