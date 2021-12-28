package bowling.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
    }

    public static String playerName() {
        OutputView.whatPlayerName();
        return SCANNER.nextLine();
    }

    public static int countOfPin(int frameIndex) {
        OutputView.whatCountOfPin(frameIndex);
        return Integer.parseInt(SCANNER.nextLine());
    }
}
