package bowling.domain.state;

public interface State {
    State bowl(int countOfPin);

    String symbol();

    boolean isFinished();
}