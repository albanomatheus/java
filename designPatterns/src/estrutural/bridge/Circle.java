package estrutural.bridge;

// Classe generica que extende Shape e implementa o metodo draw, que outro metodo de acordo com a drowAPI recebida
public class Circle extends Shape {
    private int r, x, y;

    protected Circle(int r, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.r = r;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(r, x, y);
    }
}
