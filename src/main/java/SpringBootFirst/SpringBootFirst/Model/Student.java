package SpringBootFirst.SpringBootFirst.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name = "student_info")
public class Student {
    @Id
    @NotNull
    @Column(name = "usn")
    private String usn;
    @Column(name = "firstname")
    private String fristname;
    @Column(name = "lastname")
    private String lastname;

    @OneToMany
    @JoinColumn(name = "usn")
    private List<PhoneNumbers> phoneNumbers;

    public Student() {
    }

    public Student(@NotNull String usn, String fristname, String lastname, List<PhoneNumbers> phoneNumbers) {
        this.usn = usn;
        this.fristname = fristname;
        this.lastname = lastname;
        this.phoneNumbers = phoneNumbers;
    }

    public List<PhoneNumbers> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    //    public Student(String fristName, String lastName, String usn) {
//        this.fristname = fristName;
//        this.lastname = lastName;
//        this.usn = usn;
//    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

}