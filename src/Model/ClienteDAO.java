/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.hibernate.Session;

/**
 *
 * @author Everson
 */
public class ClienteDAO implements ClienteInterfaceDAO{

    private Session session;
    
    @Override
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

    @Override
    public void update(Cliente cliente) {
        
        session = HibernateUtil.getSessionFactory().openSession();

		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(cliente);
			session.getTransaction().commit();
		} finally {
			session.close();

		}
       
    }
    
}
