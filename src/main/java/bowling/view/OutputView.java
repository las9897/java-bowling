package bowling.view;

public class OutputView {
    private OutputView() {
    }

    public static void whatPlayerName() {
        System.out.print("플레이어 이름은(3 english letters)?: ");
    }

    public static void whatCountOfPin(int frameIndex) {
        System.out.printf("%d프레임 투구 : ", frameIndex);
    }

}
