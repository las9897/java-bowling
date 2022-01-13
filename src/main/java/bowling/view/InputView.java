package bowling.view;

import bowling.domain.frame.Frame;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static String playerName() {
        OutputView.whatPlayerName();
        return SCANNER.nextLine();
    }

    public static int countOfPin(Frame frame) {
        OutputView.whatCountOfPin(frame.getIndex());
        return Integer.parseInt(SCANNER.nextLine());
    }
}
