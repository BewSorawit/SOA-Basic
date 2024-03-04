package th.ac.ku.kps.eng.cpe.soa.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;

import th.ac.ku.kps.eng.cpe.soa.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.model.Phonenumber;

public class CustomerDAO {
	public ArrayList<Customer> getAllCustomers() {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Customer");
		ArrayList<Customer> customers = (ArrayList<Customer>) query.list();
		session.close();
		return customers;
	}

//	public boolean addCustomer(Customer c) {
//		try {
//			Session session = SessionUtil.getSession();
//			//Transaction tx = session.beginTransaction();
//			//tx.begin();
//			session.save(c);
//			//tx.commit();
//			session.close();
//		} catch (TransactionException e) {
//			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}

	public boolean addCustomer(Customer c) {
		try {
			Session session = SessionUtil.getSession();
			Transaction tx = session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
			return true;
		} catch (TransactionException e) {
			e.printStackTrace();
			return false;
		}
	}

	public Customer getCustomerByName(String name) {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Customer where name = :name");
		query.setParameter("name", name);
		Customer customer = (Customer) query.uniqueResult();
		session.close();
		return customer;
	}

}
