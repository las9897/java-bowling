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
        //NormalFrame
        while (!currentFrame.isLast()) {
            currentFrame = this.normalPitching(currentFrame);
        }
        //LastFrame
        this.lastPitching(currentFrame);
    }

    private Frame normalPitching(Frame frame) {
        pitching(frame);
        return frames.nextFrame(frame);
    }

    private void lastPitching(Frame frame) {
        if (frame.isLast()) {
            pitching(frame);
        }
    }

    private void pitching(Frame frame) {
        while (frame.isNotFinished()) {
            frame.pitching(InputView.countOfPin(frame));
            OutputView.printBowling(player, frames);
        }
    }
}
