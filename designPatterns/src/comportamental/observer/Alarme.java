package comportamental.observer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alarme {
    private List<Pessoa> obs = new ArrayList<>();
    private Date horaDispertar;

    public Alarme(String horaDispertar) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        this.horaDispertar = sdf.parse(horaDispertar);
        System.out.println(this.horaDispertar);
    }

    public List<Pessoa> getObs() {
        return obs;
    }

    public void addObs(Pessoa obs) {
        this.obs.add(obs);
    }

    public Date getHora() {
        return horaDispertar;
    }


    public void dispertar() {
        if (new SimpleDateFormat("HH:mm:ss").format(this.horaDispertar).compareTo(new SimpleDateFormat("HH:mm:ss").format(new Date())) == 0) {
            for (Pessoa ob : obs) {
                ob.alertar();
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Alarme a = new Alarme("14:37:20");

        new Pessoa("Joao", a);
        new Pessoa("Ana", a);
        new Pessoa("Maria", a);

        while (true) {
            a.dispertar();
        }

    }
}
