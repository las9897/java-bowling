package bowling.domain.frame;

public class NormalFrame extends AbstractFrame {

    public NormalFrame(int index) {
        super(index);
    }

    @Override
    public boolean isNotFinished() {
        return true;
    }
}
