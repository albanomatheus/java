package DAO;

import model.Aluno;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class AlunoDAO {
    private static AlunoDAO INSTANCE;
    private Session hiberConnection;

    public static AlunoDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AlunoDAO();
        }

        return INSTANCE;
    }

    private AlunoDAO() {}

    public Aluno getById(int id) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.get(Aluno.class, id);
        } finally {
            this.hiberConnection.close();
        }
    }

    public List<Aluno> getAll() {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.createQuery("from model.Aluno").getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean save(Aluno aluno) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.save(aluno);
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean update(Aluno aluno) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.update(aluno);
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean remove(int id) {
        try {
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.remove(getById(id));
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

}