package bowling.domain.frame;

public class LastFrame extends AbstractFrame {
    public LastFrame() {
        super(10);
    }

    @Override
    public boolean isFinished() {
        return true;
    }


}
