package bowling.domain.frame;

import bowling.domain.state.State;

public interface Frame {
    void pitching(int countOfPin);

    State getBowlState();

    int getIndex();

    boolean isNotFinished();

    boolean isLast();
}
