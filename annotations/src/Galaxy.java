@SmartPhoneAnnotation(fabricante = "Samsung", preco = 3000)
public class Galaxy {
    public boolean ligado;

    public Galaxy() {
        this.ligado = false;
    }

    public void ligar() {
        System.out.println("GALAXY");
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void chamada(String n) {
        if (this.ligado) {
            System.out.println("Ligando para " + n);
        } else {
            System.out.println("O Telefone não está ligado");
        }
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "ligado=" + ligado +
                '}';
    }
}
