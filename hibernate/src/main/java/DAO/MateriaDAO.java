package DAO;

import model.Materia;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class MateriaDAO {
    private static MateriaDAO INSTANCE;
    private Session hiberConnection;

    public static MateriaDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MateriaDAO();
        }

        return INSTANCE;
    }

    private MateriaDAO() {}

    public Materia getById(int id) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.get(Materia.class, id);
        } finally {
            this.hiberConnection.close();
        }
    }

    public List<Materia> getAll() {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.createQuery("from model.Materia").getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean save(Materia materia) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.save(materia);
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean update(Materia materia) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.update(materia);
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