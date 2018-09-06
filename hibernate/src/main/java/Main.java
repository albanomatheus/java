import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Aluno aluno = new Aluno("java");
        session.save(aluno);

        session.getTransaction().commit();

        Query q = session.createQuery("From Aluno ");

        List<Aluno> resultList = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Aluno next : resultList) {
            System.out.println("next employee: " + next.getNome());
        }

    }
}
