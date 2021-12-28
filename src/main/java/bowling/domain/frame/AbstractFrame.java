package bowling.domain.frame;

import bowling.domain.state.BowlState;
import bowling.domain.state.running.Ready;
import bowling.view.InputView;

public abstract class AbstractFrame implements Frame {
    private final int index;
    protected BowlState bowlState = new Ready();

    public AbstractFrame(int index) {
        this.index = index;
    }

    @Override
    public void bowl() {
        while (bowlState.isNotFinished()) {
            this.bowlState = this.bowlState.bowl(InputView.countOfPin(index));
        }
    }
}
