package bowling.domain.frame;

import bowling.domain.state.BowlState;

public interface Frame {
    void pitching(int countOfPin);

    BowlState getBowlState();

    int getIndex();

    boolean isNotFinished();

    boolean isLast();
}
