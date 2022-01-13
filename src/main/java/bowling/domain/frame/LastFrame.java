package bowling.domain.frame;

import bowling.domain.state.bonus.BonusReady;
import bowling.domain.state.finished.Spare;
import bowling.domain.state.finished.Strike;

public class LastFrame extends AbstractFrame {

    public LastFrame() {
        super(10);
    }

    @Override
    public void pitching(int countOfPin) {
        this.state = this.state.bowl(countOfPin);

        if (isBonus()) {
            this.state = new BonusReady(this.state);
        }

        if (this.state.isFinished()) {
            finish();
        }

    }

    private boolean isBonus() {
        return this.state instanceof Spare || this.state instanceof Strike;
    }

    @Override
    public boolean isLast() {
        return true;
    }

}
