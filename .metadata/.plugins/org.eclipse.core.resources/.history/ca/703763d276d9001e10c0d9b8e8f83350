package th.ac.ku.kps.eng.cpe.dao;

import th.ac.ku.kps.eng.cpe.entity.Customer;

import java.util.ArrayList;

public class CustomerDAO {
	private static ArrayList<Customer> customers;

	static {
		customers = new ArrayList<>();
		initializeData();
	}

	private static void initializeData() {
		Customer c1 = new Customer("Mr. Smith");
		Customer c2 = new Customer("Mrs. Smith");

		customers.add(c1);
		customers.add(c2);
	}

	public static ArrayList<Customer> getAllCustomers() {
		return customers;
	}
}