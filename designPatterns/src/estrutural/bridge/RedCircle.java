package estrutural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int r, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + r + ", x: " + x + ", y:" + y + "]");
    }
}
