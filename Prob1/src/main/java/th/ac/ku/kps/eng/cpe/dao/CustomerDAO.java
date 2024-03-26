package th.ac.ku.kps.eng.cpe.dao;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.TransactionException;
import org.hibernate.query.Query;

import th.ac.ku.kps.eng.cpe.entity.Customer;
import th.ac.ku.kps.eng.cpe.entity.Phonenumber;
import th.ac.ku.kps.eng.cpe.dao.SessionUtil;

public class CustomerDAO {

	public CustomerDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

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
//			Transaction tx = session.beginTransaction();
//			tx.begin();
//			session.save(c);
//			tx.commit();
//			session.close();
//		} catch (TransactionException e) {
//			e.printStackTrace();
//			return false;
//		}
//		return true;
//	}

	public boolean addCustomer(Customer customer) throws Exception {
		Session session = null;
		Transaction transaction = null;
		try {
			session = SessionUtil.getSession();
			transaction = session.beginTransaction();

			// บันทึกลูกค้าลงในฐานข้อมูล
			session.save(customer);

			// บันทึกหมายเลขโทรศัพท์ลงในฐานข้อมูล
			for (Phonenumber phonenumber : customer.getPhonenumbers()) {
				// เซ็ต user_ID ของผู้ใช้ในหมายเลขโทรศัพท์
				phonenumber.setCustomer(customer);
				session.save(phonenumber);
			}

			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			throw e; // ส่ง Exception กลับออกไปเพื่อรับมือต่อไป
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public ArrayList<Customer> getAllCustomersWithPhonenumbers() {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            List<Customer> customers = session.createQuery(
//                    "select distinct c from Customer c join fetch c.phonenumbers", Customer.class).list();
//            return new ArrayList<>(customers);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ArrayList<>();
//        }
//    }

}
