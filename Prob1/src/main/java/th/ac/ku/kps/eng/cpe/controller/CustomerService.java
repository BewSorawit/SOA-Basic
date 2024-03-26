package th.ac.ku.kps.eng.cpe.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;
import th.ac.ku.kps.eng.cpe.entity.Customer;
import th.ac.ku.kps.eng.cpe.entity.Phonenumber;

@Path("/services")
public class CustomerService {
	CustomerDAO cusDao = new CustomerDAO();

	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getUsers() {
		return cusDao.getAllCustomers();
	}
	
	// @GET
    // @Path("/customersNumber")
    // @Produces(MediaType.APPLICATION_JSON)
    // public List<Customer> getAllCustomersWithPhoneNumbers() {
    //     return cusDao.getAllCustomersWithPhonenumbers();
    // }

//	@GET
//	@Path("/customers/{param}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Customer getCustomerByname(@PathParam("param") String name) {
//		return cusDao.getCustomerByName(name);
//	}

//	@POST
//	@Path("/customers/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response createCustomer(Customer cus) throws IOException {
//		boolean i = cusDao.addCustomer(cus);
//		if (i == true)
//			return Response.status(201).entity(" create successfully").build();
//		else
//			return Response.status(201).entity(" create fail").build();
//	}

	
	
	@POST
	@Path("/customers/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createCustomer(Customer cus) {
	    try {
	        boolean i = cusDao.addCustomer(cus);
	        if (i) {
	            return Response.status(201).entity(" create successfully").build();
	        } else {
	            return Response.status(500).entity(" create fail").build();
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // หรือเขียนลงใน log file หรือรายงานไปยังผู้ดูแลระบบ
	        return Response.status(500).entity("An error occurred while creating the customer").build();
	    }
	}

	
//	@POST
//	@Path("/customers/create")
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response createCustomer(CustomerRequest customerRequest) {
//		try {
//			// Create a new customer entity
//			Customer customer = new Customer();
//			customer.setName(customerRequest.getName());
//
//			// Create a list to hold the phone numbers
//			for (PhonenumberRequest phoneNumberRequest : customerRequest.getPhonenumbers()) {
//				Phonenumber phoneNumber = new Phonenumber();
//				phoneNumber.setNumber(phoneNumberRequest.getNumber());
//				// Associate the phone number with the customer
//				customer.getPhonenumbers().add(phoneNumber);
//			}
//
//			// Save the customer entity along with its associated phone numbers
//			boolean created = cusDao.addCustomer(customer);
//			if (created) {
//				return Response.status(Response.Status.CREATED).entity("Customer created successfully").build();
//			} else {
//				return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Failed to create customer")
//						.build();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
//					.entity("Failed to create customer: " + e.getMessage()).build();
//		}
//	}



}
