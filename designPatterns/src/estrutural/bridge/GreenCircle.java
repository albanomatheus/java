package estrutural.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int r, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + r + ", x: " + x + ", y:" + y + "]");
    }
}
