package baseball.domain;

public enum OutputString {
    BALL("볼"),
    STRIKE("스트라이크"),
    NOTHING("낫싱"),
    START("숫자 야구 게임을 시작합니다."),
    INPUT("숫자를 입력해주세요 : "),
    FINAL("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

    private String print;

    OutputString(String print) {
        this.print = print;
    }

    public String getPrint() {
        return print;
    }
}

