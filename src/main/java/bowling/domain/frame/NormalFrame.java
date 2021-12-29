package bowling.domain.frame;

public class NormalFrame extends AbstractFrame {

    public NormalFrame(int index) {
        super(index);
    }

    @Override
    public void pitching(int countOfPin) {
        this.bowlState = this.bowlState.bowl(countOfPin);
        if (!this.bowlState.isNotFinished()) {
            finish();
        }
    }

    @Override
    public boolean isLast() {
        return false;
    }
}
