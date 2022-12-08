package baseball.controller;

import baseball.service.CheckNumber;
import baseball.service.ComputerNumber;
import baseball.validation.InputValidation;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private CheckNumber checkNumber = new CheckNumber();
    private ComputerNumber computerNumber = new ComputerNumber();
    private InputValidation validation = new InputValidation();
    private InputView inputView = new InputView();
    private OutputView outputView = new OutputView();
    private List<Integer> randomNumber = new ArrayList<>();
    private String inputNum;
    private int ballCount = 0;
    private int strikeCount = 0;

    public void gameProcess(int idx) {
        ballCount += checkNumber.checkBall(randomNumber, inputNum, idx);
        strikeCount += checkNumber.checkStrike(randomNumber, inputNum, idx);
    }

    public void gameStartAndEnd() {
        ballCount = 0;
        strikeCount = 0;
        outputView.startGame();
        randomNumber = computerNumber.makeComputerNumber();
        while (strikeCount != 3) {
            ballCount = 0;
            strikeCount = 0;
            outputView.printInputNumber();
            inputNum = inputView.inputNumber();
            validation.playerInputNumberValidation(inputNum);
            for (int i = 0; i < randomNumber.size(); i++) {
                gameProcess(i);
            }
            outputView.printResult(strikeCount, ballCount);
        }
        outputView.printEnd();
        outputView.printRestart();
        String restart = inputView.inputNumber();
        validation.playerRestartValidation(restart);
        if (restart.equals("1")) {
            gameStartAndEnd();
        }
    }
}
