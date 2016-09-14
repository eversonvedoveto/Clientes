package Model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//GIT RECEBENDO
/**
 *
 * @author Everson RA 1502516-5
 */
public class ClienteDAO {
    
    protected EntityManager entityManager;

    
    
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
    
    
    

    public void merge(Cliente cliente) {
                     try {
                              entityManager.getTransaction().begin();
                              entityManager.merge(cliente);
                              entityManager.getTransaction().commit();
                     } catch (Exception ex) {
                              entityManager.getTransaction().rollback();
                     }
           }
    
    
    public Cliente getById(long id) {
                  return entityManager.find(Cliente.class, id);
           }
    
}
