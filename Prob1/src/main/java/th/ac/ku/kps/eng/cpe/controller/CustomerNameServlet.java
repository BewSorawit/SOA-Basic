package th.ac.ku.kps.eng.cpe.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;
import th.ac.ku.kps.eng.cpe.entity.Customer;

public class CustomerNameServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		String[] values = req.getParameterValues("name");

		ArrayList<Customer> listOfCustomer = new CustomerDAO().getAllCustomers();
		
		for (String value : values) {
//			out.write(value);
			for (Customer c : listOfCustomer) {
				if (c.getName().equals(value)) {
					ByteArrayOutputStream op = new ByteArrayOutputStream();
					ObjectMapper mapper = new ObjectMapper();
					
					mapper.writeValue(op, c);
					byte[] data = op.toByteArray();
					out.write(new String(data).toString());

					out.write("\n");
					break;
				}
			}
		}

	}

}
