package bowling.domain.state.finished;

import bowling.domain.state.BowlState;

public abstract class Finished implements BowlState {

    protected static final String DELIMITER = "|";
    private static final String MESSAGE_FINISHED_PITCH = "투구가 이미 완료되어 실행할 수 없습니다.";

    @Override
    public BowlState bowl(int countOfPin) {
        throw new IllegalStateException(MESSAGE_FINISHED_PITCH);
    }

    @Override
    public boolean isNotFinished() {
        return false;
    }

}
