package SpringBootFirst.SpringBootFirst.Model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity(name = "users")
public class Users {

    @Id
    @Column(name = "usn")
    private String usn;

//    @Column(name = "role_id")
//    private int roleid;

    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;

    public Users() {
    }

    public Users(String usn, String password, Role role) {
        this.usn = usn;
        this.password = password;
        this.role = role;
    }

    public Users(Users users) {
        this.usn=users.getUsn();
        this.password=users.getPassword();
        this.role=users.getRole();
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
