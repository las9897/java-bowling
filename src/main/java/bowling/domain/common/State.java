package bowling.domain.common;

public interface State {
    State bowl(int countOfPin);

    boolean isFinished();
}