package bowling.domain.frame;

import bowling.domain.state.BowlState;
import bowling.domain.state.running.Ready;

public abstract class AbstractFrame implements Frame {
    protected final int index;
    protected boolean finished;
    protected BowlState bowlState = new Ready();

    public AbstractFrame(int index) {
        this.index = index;
        this.finished = false;
    }

    protected void finish() {
        finished = true;
    }

    @Override
    public BowlState getBowlState() {
        return bowlState;
    }

    @Override
    public int getIndex() {
        return index;
    }

    @Override
    public boolean isNotFinished() {
        return !finished;
    }
}
