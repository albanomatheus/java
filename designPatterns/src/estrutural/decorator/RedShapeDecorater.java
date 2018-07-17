package estrutural.decorator;

// Classe que age igual uma Shape, porem com o metodo draw modificado
public class RedShapeDecorater extends ShapeDecorator {
    public RedShapeDecorater(Shape decoratedShape) {
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}
