package th.ac.ku.kps.eng.cpe.soa.controller;

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

import com.fasterxml.jackson.databind.JsonNode;

import th.ac.ku.kps.eng.cpe.soa.dao.CustomerDAO;
import th.ac.ku.kps.eng.cpe.soa.model.Customer;
import th.ac.ku.kps.eng.cpe.soa.model.Phonenumber;

@Path("/services")
public class CustomerService {
	CustomerDAO cusDao = new CustomerDAO();

	@GET
	@Path("/customers")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllCustomers() {
		try {
			List<Customer> customers = cusDao.getAllCustomers();
			return Response.status(200).entity(customers).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Internal Server Error").build();
		}
	}

	@GET
	@Path("/customers/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomerByName(@PathParam("param") String name) {
		try {
			Customer customer = cusDao.getCustomerByName(name);
			if (customer != null) {
				return Response.status(200).entity(customer).build();
			} else {
				return Response.status(404).entity("Customer not found").build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Internal Server Error").build();
		}
	}

	@POST
    @Path("/customers/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createCustomer(Customer cus) throws IOException {
        try {
            boolean success = cusDao.addCustomer(cus);
            if (success) {
                return Response.status(201).entity("Customer created successfully").build();
            } else {
                return Response.status(400).entity("Failed to create customer. Validation error?").build();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(500).entity("Internal Server Error").build();
        }
    }



}