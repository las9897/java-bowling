package bowling.domain.state.running;

import bowling.domain.state.State;

public abstract class Running implements State {

    private static final String MESSAGE_NOT_FINISHED_PITCH = "투구가 완료되지 않아 실행할 수 없습니다.";

    @Override
    public String symbol() {
        throw new IllegalStateException(MESSAGE_NOT_FINISHED_PITCH);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

