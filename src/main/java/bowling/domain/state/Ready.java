package bowling.domain.state;

import bowling.domain.Pin;
import bowling.domain.common.Running;
import bowling.domain.common.State;

public class Ready extends Running {

    @Override
    public State bowl(int countOfPin) {
        Pin.validationCountOfPin(countOfPin);
        if (Pin.isMax(countOfPin)) {
            return new Strike();
        }
        return new FirstBowl(countOfPin);
    }
}
