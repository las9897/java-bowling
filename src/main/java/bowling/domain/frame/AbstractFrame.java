package bowling.domain.frame;

import bowling.domain.state.State;
import bowling.domain.state.running.Ready;

public abstract class AbstractFrame implements Frame {
    protected final int index;
    protected boolean finished;
    protected State state = new Ready();

    public AbstractFrame(int index) {
        this.index = index;
        this.finished = false;
    }

    protected void finish() {
        finished = true;
    }

    @Override
    public State getBowlState() {
        return state;
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
