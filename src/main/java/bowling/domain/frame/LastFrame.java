package bowling.domain.frame;

import bowling.domain.state.State;

public class LastFrame extends AbstractFrame {
    private State secondBowlState;

    public LastFrame() {
        super(10);
    }

    @Override
    public void pitching(int countOfPin) {
        this.bowlState = this.bowlState.bowl(countOfPin);
    }


    @Override
    public boolean isLast() {
        return true;
    }
}
