package baseball.view;

import baseball.domain.OutputString;

public class OutputView {
    public void startGame() {
        System.out.println(OutputString.START.getPrint());
    }
    public void printInputNumber() {
        System.out.print(OutputString.INPUT.getPrint());
    }
    public void printResult(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            System.out.println(OutputString.NOTHING.getPrint());
            return;
        }
        if (strike == 0) {
            System.out.println(ball+OutputString.BALL.getPrint());
            return;
        }
        if (ball == 0) {
            System.out.println(strike+OutputString.STRIKE.getPrint());
            return;
        }
        System.out.println(ball+OutputString.BALL.getPrint() + " " + strike + OutputString.STRIKE.getPrint());
    }
    public void printEnd() {
        System.out.println(OutputString.FINAL.getPrint());
    }
    public void printRestart() {
        System.out.println(OutputString.RESTART.getPrint());
    }
}
