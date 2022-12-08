package baseball.controller;

import baseball.service.CheckNumber;
import baseball.service.ComputerNumber;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private static CheckNumber checkNumber = new CheckNumber();
    private static ComputerNumber computerNumber = new ComputerNumber();
    private static InputView inputView = new InputView();
    private static OutputView outputView = new OutputView();
    private List<Integer> randomNumber = new ArrayList<>();
    private String inputNum;
    private int ballCount = 0;
    private int strikeCount = 0;

    public void gameProcess(int idx) {
        outputView.printInputNumber();
        inputNum = inputView.inputNumber();
        ballCount += checkNumber.checkBall(randomNumber, inputNum, idx);
        strikeCount += checkNumber.checkStrike(randomNumber, inputNum, idx);
    }

    public void gameStart() {
        outputView.startGame();
        randomNumber = computerNumber.makeComputerNumber();
        while (strikeCount != 3) {
            ballCount = 0;
            strikeCount = 0;
            for (int i = 0; i < randomNumber.size(); i++) {
                gameProcess(i);
            }
            outputView.printResult(strikeCount, ballCount);
        }
    }
}
