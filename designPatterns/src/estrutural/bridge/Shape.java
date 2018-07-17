package estrutural.bridge;

// Classe abstrata que recebe qualquer objeto que implenta a interface DrawAPI e possue o metodo draw
// Quem extender estará do outro lado da ponte
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
