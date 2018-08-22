package dao;

import java.sql.Date;
import java.sql.Timestamp;

public class EntityDAO {

    private long id;
    private String name;
    private String form;
    private String status;
    private Timestamp bornDate;

    public EntityDAO(String name, String form, String status) {
        this.name = name;
        this.form = form;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getBornDate() {
        return bornDate;
    }
}
