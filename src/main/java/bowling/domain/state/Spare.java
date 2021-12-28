package bowling.domain.state;

import bowling.domain.Pin;
import bowling.domain.common.Finished;

public class Spare extends Finished {

    private static final String SYMBOL = "/";

    private final Pin firstFallenPins;
    private final Pin secondFallenPins;

    public Spare(int firstFallenPins, int secondFallenPins) {
        this.firstFallenPins = new Pin(firstFallenPins);
        this.secondFallenPins = new Pin(secondFallenPins);
    }

    @Override
    public String symbol() {
        return firstFallenPins.getCountOfPin() + DELIMITER + SYMBOL;
    }
}
