package bowling;

import bowling.domain.BowlingGame;
import bowling.domain.Player;
import bowling.domain.frame.Frames;
import bowling.view.InputView;
import bowling.view.OutputView;

public class BowlingController {

    public static void main(String[] args) {
        Player player = new Player(InputView.playerName());
        Frames frames = Frames.of();
        OutputView.printBowling(player, frames);

        BowlingGame bowlingGame = BowlingGame.init(player);

        bowlingGame.startGame();
    }
}
