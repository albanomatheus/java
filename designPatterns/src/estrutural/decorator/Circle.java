package estrutural.decorator;

// Classe que possue o comportamento padrão do metodo draw
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: circle");
    }
}
