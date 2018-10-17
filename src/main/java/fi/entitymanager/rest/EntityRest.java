package fi.entitymanager.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import database.DatabaseOperations;
import fi.entitymanager.dao.EntityDAO;
import fi.entitymanager.resources.Constants;

@Path("/entity")
public class EntityRest {
	
	DatabaseOperations databaseOperations;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return Constants.defautResponse;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHelloXML() {
		return "<?xml version=\"1.0\"?>" + "<h1><hello>" + Constants.defautResponse + "</hello></h2>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + Constants.defautResponse + "</body></h1>" + "</html> ";
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public EntityDAO getEntity(@PathParam("id") String id) {
		return databaseOperations.getEntity(id);
	}

}
