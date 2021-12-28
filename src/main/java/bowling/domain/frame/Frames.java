package bowling.domain.frame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Frames {

    private final List<Frame> frames;

    private Frames(List<Frame> frames) {
        this.frames = frames;
    }

    public static Frames of() {
        List<Frame> frames = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            frames.add(new NormalFrame(i));
        }
        frames.add(new LastFrame());
        return new Frames(frames);
    }

    public void bowl(){
        frames.forEach(Frame::bowl);
    }


}
