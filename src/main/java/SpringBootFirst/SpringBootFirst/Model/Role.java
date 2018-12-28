package SpringBootFirst.SpringBootFirst.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "Role")
public class Role {

    @Id
    @NotNull
    @Column(name = "role_id")
    private int roleid;

    @Column(name = "role_name")
    private String rolename;

    public Role() {
    }

    public Role(@NotNull int roleid, String rolename) {
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
