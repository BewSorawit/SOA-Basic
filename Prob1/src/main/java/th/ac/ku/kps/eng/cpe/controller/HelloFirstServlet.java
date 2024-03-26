package th.ac.ku.kps.eng.cpe.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloFirstServlet {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloWorld() {
		return "Servlet 3 web.xml example configuration";
	}
}
