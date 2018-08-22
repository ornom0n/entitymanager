package dao;

import java.sql.Timestamp;

public class EntityRelationshipDAO {

    private String entityRelationshipId;
    private String toEntityId;
    private String fromEntityId;
    private String type;
    private Timestamp startDate;
    private Timestamp lastUpdateDate;

    public String getEntityRelationshipId() {
        return entityRelationshipId;
    }

    public void setEntityRelationshipId(String entityRelationshipId) {
        this.entityRelationshipId = entityRelationshipId;
    }

    public String getToEntityId() {
        return toEntityId;
    }

    public void setToEntityId(String toEntityId) {
        this.toEntityId = toEntityId;
    }

    public String getFromEntityId() {
        return fromEntityId;
    }

    public void setFromEntityId(String fromEntityId) {
        this.fromEntityId = fromEntityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }
}
