package TestMain;

import java.util.HashSet;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;
import th.ac.ku.kps.eng.cpe.entity.Customer;
import th.ac.ku.kps.eng.cpe.entity.Phonenumber;

public class MainCustomerDAO {
	public static void main(String[] args) throws Exception {
		CustomerDAO c = new CustomerDAO();
		c.addCustomer(new Customer("S1", new HashSet<Phonenumber>()));
		for (Customer cs : c.getAllCustomers())
			System.out.println(cs.getName());
	}
}
