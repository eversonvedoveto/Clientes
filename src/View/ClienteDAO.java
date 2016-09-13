/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;

/**
 *
 * @author Everson
 */
public class ClienteDAO {
    
    protected EntityManager entityManager;

    private Session session;
    
    public ClienteDAO() {
                     entityManager = getEntityManager();
           }
    
    private EntityManager getEntityManager() {
                     EntityManagerFactory factory = Persistence.createEntityManagerFactory("clientes?zeroDateTimeBehavior=convertToNullPU");
                     if (entityManager == null) {
                              entityManager = factory.createEntityManager();
                     }
   
                     return entityManager;
           }
    
    
    public void save(Cliente cliente) {
       session = HibernateUtil.getSessionFactory().openSession();
       try {
			session.beginTransaction();
			session.save(cliente);
			session.getTransaction().commit();

		} finally {
			session.close();

		}
    }

    public void merge(Cliente cliente) {
                     try {
                              entityManager.getTransaction().begin();
                              entityManager.merge(cliente);
                              entityManager.getTransaction().commit();
                     } catch (Exception ex) {
                              ex.printStackTrace();
                              entityManager.getTransaction().rollback();
                     }
           }
    
    
    public Cliente getById(long id) {
                  return entityManager.find(Cliente.class, id);
           }
    
}
