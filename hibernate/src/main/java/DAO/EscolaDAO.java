package DAO;

import model.Escola;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.List;

public class EscolaDAO {
    private static EscolaDAO INSTANCE;
    private Session hiberConnection;

    public static EscolaDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EscolaDAO();
        }

        return INSTANCE;
    }

    private EscolaDAO() {}

    public Escola getById(int id) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.get(Escola.class, id);
        } finally {
            this.hiberConnection.close();
        }
    }

    public List<Escola> getAll() {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            return this.hiberConnection.createQuery("from model.Escola").getResultList();
        } catch (Exception e) {
            return null;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean save(Escola escola) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.save(escola);
            this.hiberConnection.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            this.hiberConnection.close();
        }
    }

    public boolean update(Escola escola) {
        try {
            this.hiberConnection = HibernateUtil.getSessionFactory().openSession();
            this.hiberConnection.getTransaction().begin();
            this.hiberConnection.update(escola);
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