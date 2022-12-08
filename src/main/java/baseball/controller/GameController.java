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
    private int ballCount;
    private int strikeCount;

    public void resetCount() {
        ballCount = 0;
        strikeCount = 0;
    }

    public void gameProcess(int idx) {
        ballCount += checkNumber.checkBall(randomNumber, inputNum, idx);
        strikeCount += checkNumber.checkStrike(randomNumber, inputNum, idx);
    }

    public void repeatProgress() {
        while (strikeCount != 3) {
            resetCount();
            outputView.printInputNumber();
            inputNum = inputView.inputNumber();
            validation.playerInputNumberValidation(inputNum);
            for (int i = 0; i < randomNumber.size(); i++) {
                gameProcess(i);
            }
            outputView.printResult(strikeCount, ballCount);
        }
    }

    public void choiceRestart() {
        String restart = inputView.inputNumber();
        validation.playerRestartValidation(restart);
        if (restart.equals("1")) {
            gameStartAndEnd();
        }
    }

    public void gameStartAndEnd() {
        resetCount();
        outputView.startGame();
        randomNumber = computerNumber.makeComputerNumber();
        repeatProgress();
        outputView.printEnd();
        outputView.printRestart();
        choiceRestart();
    }
}
