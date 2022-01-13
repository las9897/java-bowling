package bowling.domain.frame;

import java.util.ArrayList;
import java.util.List;

public class Frames {

    private final List<Frame> frames;

    private Frames(List<Frame> frames) {
        this.frames = frames;
    }

    public static Frames of() {
        List<Frame> frames = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            frames.add(new NormalFrame(i));
        }
        frames.add(new LastFrame());
        return new Frames(frames);
    }

    public Frame firstFame() {
        return frames.get(0);
    }

    public Frame nextFrame(Frame frame) {
        int index = frame.getIndex();

        return frames.get(frame.getIndex()); // frame의 index는 1부터 시작
    }

    public List<Frame> getFrames() {
        return frames;
    }

}
