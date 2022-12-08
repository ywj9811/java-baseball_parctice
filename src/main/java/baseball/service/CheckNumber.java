package baseball.service;

import java.util.List;

public class CheckNumber {
    public int checkBall(List<Integer> computerNumber, String number, int idx) {
        if (number.charAt(idx) == computerNumber.get(idx)) {
            return 0;
        }
        if (number.contains(String.valueOf(computerNumber.get(idx)))) {
            return 1;
        }
        return 0;
    }

    public int checkStrike(List<Integer> computerNumber, String number, int idx) {
        if (number.charAt(idx) == computerNumber.get(idx)) {
            return 1;
        }
        return 0;
    }
}
