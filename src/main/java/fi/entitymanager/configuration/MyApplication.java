package fi.entitymanager.configuration;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

import fi.entitymanager.resources.EntityRest;

@ApplicationPath("/")
public class MyApplication extends ResourceConfig {
    
	public MyApplication() {
		register(EntityRest.class);
	}
	
}