package baseball.view;

import baseball.domain.OutputString;

public class OutputView {
    private OutputString outputString;

    public void startGame() {
        System.out.println(outputString.START.getPrint());
    }
    public void printInputNumber() {
        System.out.print(outputString.INPUT.getPrint());
    }
    public void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println(outputString.NOTHING.getPrint());
            return;
        }
        if (strike == 0) {
            System.out.println(ball+outputString.BALL.getPrint());
            return;
        }
        if (ball == 0) {
            System.out.println(strike+outputString.STRIKE.getPrint());
            return;
        }
        System.out.println(ball+outputString.BALL.getPrint() + " " + strike + outputString.STRIKE.getPrint());
    }
    public void printEnd() {
        System.out.println(outputString.RESTART.getPrint());
    }
    public void printRestart() {
        System.out.println(outputString.RESTART.getPrint());
    }
}
