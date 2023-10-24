package baseball.view;

import baseball.domain.GameResult;

public class OutputView {

    private static final String LINE_CHANGE = "\n";
    private static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String NOTHING = "낫싱";
    private static final String BALL = "%d볼";
    private static final String STRIKE = "%d스트라이크";
    private static final String GAME_SUCCESS = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public static void gameStart() {
        System.out.println(GAME_START);
    }
    public static void outputResult(GameResult result) {
        if (result.isNothing()) {
            System.out.println(NOTHING);
        }
        if (result.hasBall() && result.hasStrike()) {
            System.out.printf(BALL+" "+STRIKE+LINE_CHANGE,result.getBall(),result.getStrike());
            return;
        }
        if (result.hasBall()) {
            System.out.printf(BALL+LINE_CHANGE,result.getBall());
        }
        if (result.hasStrike()) {
            System.out.printf(STRIKE+LINE_CHANGE,result.getStrike());
        }
    }

    public static void gameSuccess() {
        System.out.println(GAME_SUCCESS);
    }
}
