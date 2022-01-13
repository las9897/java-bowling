package bowling.domain.state;

public interface State {

    String STRIKE_SYMBOL = "X";
    String SPARE_SYMBOL = "/";
    String EMPTY_SYMBOL = "";
    String FORMAT_SYMBOL = "%s|%s";
    String DELIMITER = "|";


    State bowl(int countOfPin);

    String symbol();

    boolean isFinished();

}