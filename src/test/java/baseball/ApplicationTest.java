package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 게임종료_후_재시작() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "1", "597", "589", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "1볼 1스트라이크", "3스트라이크", "게임 종료");
                },
                1, 3, 5, 5, 8, 9
        );
    }

    @Test
    void 재시작X() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("246", "135", "2");
                    assertThat(output()).contains("낫싱", "3스트라이크", "게임 종료");
                },
                1, 3, 5
        );
    }

    @Test
    void 예외_테스트5() {
        assertRandomNumberInRangeTest(
                () -> {
                    assertThatThrownBy(() -> runException("246", "135", "1", "222"))
                            .isInstanceOf(IllegalArgumentException.class);
                },
                1, 3, 5, 2, 4, 6
        );
    }
    @Test
    void 예외_테스트6() {
        assertRandomNumberInRangeTest(
                () -> {
                    assertThatThrownBy(() -> runException("246", "135", "4"))
                            .isInstanceOf(IllegalArgumentException.class);
                },
                1, 3, 5, 2, 4, 6
        );
    }

    @Test
    void 예외_테스트7() {
        assertRandomNumberInRangeTest(
                () -> {
                    assertThatThrownBy(() -> runException("246", "135", "a"))
                            .isInstanceOf(IllegalArgumentException.class);
                },
                1, 3, 5, 2, 4, 6
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("1234"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void 예외_테스트2() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("123a"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void 예외_테스트3() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("112"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
    @Test
    void 예외_테스트4() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("asd"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
