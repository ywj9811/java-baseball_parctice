package baseball.validation;

public class InputValidation {
    public void notNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    public void overNumber(String input) {
        if (input.length() != 3)
            throw new IllegalArgumentException("3자리 숫자를 입력해야 합니다.");
    }

    public void duplicatedNumber(String input) {
        if (input.charAt(0) == input.charAt(1) ||
        input.charAt(0) == input.charAt(2) ||
        input.charAt(1) == input.charAt(2))
            throw new IllegalArgumentException("중복되는 값이 있습니다.");
    }

    public void notRestartNumber(String input) {
        if (!(input.equals("1") || input.equals("2")))
            throw new IllegalArgumentException("1 혹은 2를 입력해야 합니다.");
    }

    public void playerInputNumberValidation(String input) {
        notNumber(input);
        overNumber(input);
        duplicatedNumber(input);
    }
    public void playerRestartValidation(String input) {
        notNumber(input);
        notRestartNumber(input);
    }
}
