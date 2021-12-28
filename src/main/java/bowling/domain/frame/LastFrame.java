package bowling.domain.frame;

public class LastFrame extends AbstractFrame {
    public LastFrame() {
        super(10);
    }

    @Override
    public boolean isNotFinished() {
        return false;
    }


}
