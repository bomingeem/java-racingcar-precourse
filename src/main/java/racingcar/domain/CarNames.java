package racingcar.domain;

public class CarNames {
    private static final String COMMA = ",";
    private String names;

    public CarNames(String names) {
        this.names = names;
    }

    public void validateNames(String names) {
        if (isNullOrEmptyCheck(names)) {
            throw new IllegalArgumentException("[ERROR] 값을 입력해주세요.");
        }

        String[] splitNames = getSplit(names);

        for (int i=0; i<splitNames.length; i++) {
            validateName(splitNames[i]);
        }
    }

    private String[] getSplit(String names) {
        return names.split(COMMA);
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자 이하만 가능합니다.");
        }
    }

    private boolean isNullOrEmptyCheck(String str) {
        return str == null || str == "";
    }
}
