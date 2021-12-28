package bowling.domain.state;

import bowling.domain.Pin;

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
