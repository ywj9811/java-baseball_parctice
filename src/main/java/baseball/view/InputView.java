package baseball.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public String inputNumber() {
        String input = readLine();
        System.out.println();
        return input;
    }
}
