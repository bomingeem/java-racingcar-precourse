package racingcar.domain;

public class CarName {
    private String name;

    public CarName(String name) {
        validationName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void validationName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("[ERROR] 이름은 5자 이하만 가능합니다.");
        }
    }
}
