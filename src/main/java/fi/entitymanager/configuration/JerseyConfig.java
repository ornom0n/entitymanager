package fi.entitymanager.configuration;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

import fi.entitymanager.rest.EntityRest;

@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    
	public JerseyConfig() {
		register(EntityRest.class);
	}
	
}