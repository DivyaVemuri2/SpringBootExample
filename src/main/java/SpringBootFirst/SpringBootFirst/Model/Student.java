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

//    @OneToMany
//    @JoinColumn(name = "usn")
//    private List<PhoneNumbers> phoneNumberList;

//    @ManyToMany
//    @JoinColumn(name = "usn")
//    private List<CourseInfo> courseInfoList;

    public Student() {
    }

    public Student(@NotNull String usn, String fristname, String lastname) {
        this.usn = usn;
        this.fristname = fristname;
        this.lastname = lastname;
    }

    //    public Student(@NotNull String usn, String fristname, String lastname, List<PhoneNumbers> phoneNumberList) {
//        this.usn = usn;
//        this.fristname = fristname;
//        this.lastname = lastname;
//        this.phoneNumberList = phoneNumberList;
//    }
//
//    public Student(@NotNull String usn, String fristname, String lastname, List<PhoneNumbers> phoneNumberList, List<CourseInfo> courseInfoList) {
//        this.usn = usn;
//        this.fristname = fristname;
//        this.lastname = lastname;
//        this.phoneNumberList = phoneNumberList;
//        this.courseInfoList = courseInfoList;
//    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

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

//    public List<PhoneNumbers> getPhoneNumberList() {
//        return phoneNumberList;
//    }
//
//    public void setPhoneNumberList(List<PhoneNumbers> phoneNumberList) {
//        this.phoneNumberList = phoneNumberList;
//    }
//
//    public List<CourseInfo> getCourseInfoList() {
//        return courseInfoList;
//    }
//
//    public void setCourseInfoList(List<CourseInfo> courseInfoList) {
//        this.courseInfoList = courseInfoList;
//    }
}