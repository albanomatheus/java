import dao.ContatoDAO;
import domain.Contato;

import java.util.Calendar;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Joao");
        contato.setEndereco("fasdjfa");
        contato.setEmail("kfjdslakjf");
        contato.setDataNascimento(Calendar.getInstance());

        ContatoDAO dao = new ContatoDAO();
        dao.add(contato);

        out.println("<html>");
        out.println("<body>");
        out.println("Contato " + contato.getNome() + " adicionado com sucesso");
        out.println("</body>");
        out.println("</html>");
    }
}
