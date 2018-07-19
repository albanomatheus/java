package comportamental.mediator;

import java.util.Date;

public class ChatRoom {
    // Metodo que será disponibilizado
    public static void mostrarMsg(Usuario u, String msg) {
        System.out.println(new Date().toString() + " [" + u.getNome() + "]:\t" + msg);
    }

}
