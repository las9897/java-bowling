package bowling.domain.bowl;

import bowling.domain.pin.Pin;
import bowling.domain.score.CanNotCalculateException;
import bowling.domain.score.Score;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class FinalBowl implements Bowl {

    private static final BowlType BOWL_TYPE = BowlType.FINAL;
    private static final int NONE_LEFT_CHANCE = 0;
    private static final int FIRST_PIN_INDEX = 0;
    private static final int SIZE_OF_ONE_PIN = 1;
    private static final int INDEX_UNIT = 1;

    private int leftChance = 2;
    private final List<Pin> pins;

    public FinalBowl() {
        this(new ArrayList<>());
    }

    public FinalBowl(List<Pin> pins) {
        this.pins = pins;
    }

    @Override
    public Bowl pitch(Pin pin) {
        checkCanAddPin();

        if (isRegularPitch(pin)) {
            leftChance--;
        }
        pins.add(pin);
        return this;
    }

    private void checkCanAddPin() {
        if (!canPitch()) {
            throw new CanNotPitchException();
        }
    }

    @Override
    public boolean canPitch() {
        return leftChance > NONE_LEFT_CHANCE;
    }

    private boolean isRegularPitch(Pin pin) {
        return !isStrike(pin) && !isSpare(pin);
    }

    private boolean isStrike(Pin pin) {
        return pins.isEmpty() && pin.isAllHit();
    }

    private boolean isSpare(Pin pin) {
        if (pins.size() != SIZE_OF_ONE_PIN) {
            return false;
        }

        Pin firstPin = pins.get(FIRST_PIN_INDEX);
        if (firstPin.isAllHit()) {
            return false;
        }

        Pin sumOfPin = firstPin.plus(pin);
        return sumOfPin.isAllHit();
    }

    @Override
    public Score score() {
        checkPinIsExists();
        Pin lastPin = pins.get(pins.size() - INDEX_UNIT);
        return lastPin.toScore(leftChance);
    }

    private void checkPinIsExists() {
        if (pins.isEmpty()) {
            throw new CanNotCalculateException();
        }
    }

    @Override
    public boolean typeEquals(BowlType bowlType) {
        return BOWL_TYPE.equals(bowlType);
    }

    @Override
    public List<Pin> pins() {
        return unmodifiableList(pins);
    }
}
