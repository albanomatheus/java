package estrutural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(3, 20, 30, new RedCircle());
        Shape greenCircle = new Circle(3, 20, 30, new GreenCircle());

        RedCircle r = new RedCircle();
        r.drawCircle(3, 2, 5);

        redCircle.draw();
        greenCircle.draw();
    }
}
