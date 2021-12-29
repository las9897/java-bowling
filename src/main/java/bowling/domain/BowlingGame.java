package bowling.domain;

import bowling.domain.frame.Frame;
import bowling.domain.frame.Frames;
import bowling.view.InputView;
import bowling.view.OutputView;

public class BowlingGame {

    private final Player player;
    private final Frames frames;

    private BowlingGame(Player player, Frames frames) {
        this.player = player;
        this.frames = frames;
    }

    public static BowlingGame init(Player player) {
        return new BowlingGame(player, Frames.of());
    }

    public void startGame() {
        Frame currentFrame = frames.firstFame();
        while (!currentFrame.isLast()) {
            currentFrame = this.pitching(currentFrame);
        }

        currentFrame.pitching();`
    }

    public Frame pitching(Frame frame) {
        while (frame.isNotFinished()) {
            frame.pitching(InputView.countOfPin(frame));
            OutputView.printBowling(player, frames);
        }
        return frames.nextFrame(frame);
    }
}
