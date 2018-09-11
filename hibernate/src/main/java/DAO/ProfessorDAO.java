package DAO;

import model.Professor;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class ProfessorDAO {
    private static ProfessorDAO INSTANCE;
    private Session hiberConnection;

    public static ProfessorDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProfessorDAO();
        }

        return INSTANCE;
    }

    private ProfessorDAO() {}

    public Professor getById(int id) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.get(Professor.class, id);
        } finally {
            this.hiberConnection.close();
        }
    }

    public List<Professor> getAll() {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.createQuery("from model.Professor").getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean save(Professor professor) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.save(professor);
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean update(Professor professor) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.update(professor);
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