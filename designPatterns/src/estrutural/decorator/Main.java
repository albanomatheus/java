package estrutural.decorator;

// Padrão de projeto para adicionar funcionalidades a metodos ja criados
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorater(new Circle());
        Shape redRectangle = new RedShapeDecorater(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
