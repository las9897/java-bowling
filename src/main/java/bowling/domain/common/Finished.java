package bowling.domain.common;

public abstract class Finished implements State, Symbol {

    protected static final String DELIMITER = "|";
    private static final String MESSAGE_FINISHED_PITCH = "투구가 이미 완료되어 실행할 수 없습니다.";

    @Override
    public State bowl(int countOfPin) {
        throw new IllegalStateException(MESSAGE_FINISHED_PITCH);
    }

    @Override
    public boolean isFinished() {
        return true;
    }

}
