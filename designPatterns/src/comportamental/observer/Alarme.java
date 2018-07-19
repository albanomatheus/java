package comportamental.observer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe que possue uma lista de objetos a serem notificados,
// Um metodo que possue a regra para quando notificar e chama outro metodo para cada objeto a ser notificado
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
}
