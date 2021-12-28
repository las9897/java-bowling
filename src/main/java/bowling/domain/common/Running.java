package bowling.domain.common;

public abstract class Running implements State{
    @Override
    public boolean isFinished() {
        return false;
    }
}

