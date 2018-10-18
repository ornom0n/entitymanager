package fi.entitymanager.database;

import fi.entitymanager.dao.EntityDAO;
import fi.entitymanager.dao.EntityRelationshipDAO;

public interface DatabaseOperations {
	public EntityDAO getEntity(String id);
	public EntityRelationshipDAO getEntityRelationship(String id);
	public void createEntity(EntityDAO entity);
	public void createEntityRelationship(EntityRelationshipDAO entityRelationship);
}
