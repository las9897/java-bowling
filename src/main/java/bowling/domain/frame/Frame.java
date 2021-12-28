package bowling.domain.frame;

import bowling.domain.state.State;

public interface Frame extends State {
    void bowl();
}
