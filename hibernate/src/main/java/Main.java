import DAO.AlunoDAO;
import DAO.EscolaDAO;
import DAO.MateriaDAO;
import DAO.ProfessorDAO;
import model.Aluno;
import model.Escola;
import model.Materia;
import model.Professor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AlunoDAO alunoDAO = AlunoDAO.getInstance();
        MateriaDAO materiaDAO = MateriaDAO.getInstance();
        ProfessorDAO professorDAO = ProfessorDAO.getInstance();
        EscolaDAO escolaDAO = EscolaDAO.getInstance();

        Materia materia1 = new Materia("quimica");
        Materia materia2 = new Materia("fisica");
        Materia materia3 = new Materia("matematica");

        Professor professor1 = new Professor("Cesar", materia2);
        Professor professor2 = new Professor("Juliana", materia1);
        Professor professor3 = new Professor("Pedro", materia3);

        Aluno aluno1 = new Aluno("Matheus");
        Aluno aluno2 = new Aluno("Joao");
        Aluno aluno3 = new Aluno("Caio");

        Escola escola1 = new Escola("Messias Pedreiro");

        materia1.setAlunos(Arrays.asList(aluno1, aluno2));
        materia2.setAlunos(Arrays.asList(aluno3));
        materia3.setAlunos(Arrays.asList(aluno1, aluno2, aluno3));

        aluno1.setMaterias(Arrays.asList(materia1, materia3));
        aluno2.setMaterias(Arrays.asList(materia3));
        aluno3.setMaterias(Arrays.asList(materia1, materia2, materia3));

        materia1.setProfessor(professor2);
        materia2.setProfessor(professor1);
        materia3.setProfessor(professor3);

        aluno1.setEscola(escola1);
        aluno2.setEscola(escola1);
        aluno3.setEscola(escola1);
        materia1.setEscola(escola1);
        materia2.setEscola(escola1);
        materia3.setEscola(escola1);
        professor1.setEscola(escola1);
        professor2.setEscola(escola1);
        professor3.setEscola(escola1);

        escolaDAO.save(escola1);

        alunoDAO.save(aluno1);
        alunoDAO.save(aluno2);
        alunoDAO.save(aluno3);

        professorDAO.save(professor1);
        professorDAO.save(professor2);
        professorDAO.save(professor3);

        materiaDAO.save(materia1);
        materiaDAO.save(materia2);
        materiaDAO.save(materia3);

        System.out.println(professorDAO.getById(1).getMateria().getNome());
    }
}
