package SpringBootFirst.SpringBootFirst.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student_phno")
public class PhoneNumbers {

    @Id
    @Column(name = "phno")
    private int phno;
    @Column(name = "usn")
    private String usn;

    public PhoneNumbers() {
    }

    public PhoneNumbers(int phno, String usn) {
        this.phno = phno;
        this.usn = usn;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }
}
