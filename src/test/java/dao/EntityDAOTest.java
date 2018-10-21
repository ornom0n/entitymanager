package dao;

import org.junit.Test;

import fi.entitymanager.dao.EntityDAO;

import static org.junit.Assert.*;

public class EntityDAOTest {

    @Test
    public void testConstructor() {
        String entityName = "La Creatura", entityform = "Humanoid", entitystatus = "Alive";
        EntityDAO entity = new EntityDAO(entityName, entityform, entitystatus);
        assertEquals(entity.getName(), entityName);
        assertEquals(entity.getForm(), entityform);
        assertEquals(entity.getStatus(), entitystatus);
        assertEquals(entity.getId(), 0);
        assertNull(entity.getBornDate());
    }
}