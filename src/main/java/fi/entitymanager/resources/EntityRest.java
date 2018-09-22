package fi.entitymanager.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/entity")
public class EntityRest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello, I am Entity Manager";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		return "<?xml version=\"1.0\"?>" + "<h1><hello> Hello, I am Entity Manager" + "</hello></h2>";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + "Hello, I am Entity Manager" + "</body></h1>" + "</html> ";
	}

}
