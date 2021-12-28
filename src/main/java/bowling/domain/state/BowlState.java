package bowling.domain.state;

public interface BowlState extends State {
    BowlState bowl(int countOfPin);

    String symbol();
}
