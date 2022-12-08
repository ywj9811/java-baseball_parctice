package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private static final int MAX_NUM = 9;
    private static final int MIN_NUM = 1;
    private static final int SIZE = 3;

    public List<Integer> makeComputerNumber() {
        List<Integer> computerNumber = new ArrayList<>();

        while (computerNumber.size() < SIZE) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUM, MAX_NUM);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }
}
