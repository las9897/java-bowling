package bowling.domain.state;

public abstract class Running implements BowlState {
    @Override
    public boolean isFinished() {
        return false;
    }
}

