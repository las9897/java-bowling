package bowling.domain.state.finished;

import bowling.domain.Pin;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spare)) return false;
        Spare spare = (Spare) o;
        return Objects.equals(firstFallenPins, spare.firstFallenPins) && Objects.equals(secondFallenPins, spare.secondFallenPins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstFallenPins, secondFallenPins);
    }

    @Override
    public String toString() {
        return "Spare{" +
                "firstFallenPins=" + firstFallenPins +
                ", secondFallenPins=" + secondFallenPins +
                '}';
    }
}
