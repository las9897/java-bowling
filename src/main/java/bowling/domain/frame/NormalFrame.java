package bowling.domain.frame;

public class NormalFrame extends AbstractFrame {

    public NormalFrame(int index) {
        super(index);
    }

    @Override
    public void pitching(int countOfPin) {
        this.state = this.state.bowl(countOfPin);
        if (this.state.isFinished()) {
            finish();
        }
    }

    @Override
    public boolean isLast() {
        return false;
    }
}
