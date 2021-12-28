package bowling.domain.state.running;

import bowling.domain.Pin;
import bowling.domain.state.BowlState;
import bowling.domain.state.finished.Strike;

public class Ready extends Running {

    @Override
    public BowlState bowl(int countOfPin) {
        Pin.validationCountOfPin(countOfPin);
        if (Pin.isMax(countOfPin)) {
            return new Strike();
        }
        return new FirstBowl(countOfPin);
    }
}
