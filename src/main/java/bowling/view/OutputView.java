package bowling.view;

import bowling.domain.Player;
import bowling.domain.frame.Frame;
import bowling.domain.frame.Frames;
import bowling.domain.state.BowlState;

import java.util.stream.Collectors;

public class OutputView {
    private static final String DELIMITER = "\\|";
    private static final String STRING_DELIMITER = "|";
    private static final String INDEX_HEADER = "| NAME |  01  |  02  |  03  |  04  |  05  |  06  |  07  |  08  |  09  |  10  |";

    private OutputView() {
    }

    public static void whatPlayerName() {
        System.out.print("플레이어 이름은(3 english letters)?: ");
    }

    public static void whatCountOfPin(int frameIndex) {
        System.out.printf("%d프레임 투구 : ", frameIndex);
    }


    public static void printBowling(Player player, Frames frames) {
        printBowlingHeader();
        printBowlingBody(player, frames);
    }

    public static void printBowlingHeader() {
        System.out.println(INDEX_HEADER);
    }

    public static void printBowlingBody(Player player, Frames frames) {
        String playerName = player.getName();
        String body = String.format("|%5s ", playerName) +
                frames.getFrames().stream()
                        .map(Frame::getBowlState)
                        .map(BowlState::symbol)
                        .collect(Collectors.joining(STRING_DELIMITER, STRING_DELIMITER, STRING_DELIMITER)) +
                "\n";
        System.out.println(body);
    }
}
