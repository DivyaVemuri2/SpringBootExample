package SpringBootFirst.SpringBootFirst.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "student_course_mapping")
public class StudentCourseMapping implements Serializable {
    @Id
    @Column(name = "usn")
    private String usn;

    @Id
    @Column(name = "course_id")
    private String courseid;

    @ManyToOne
    @JoinColumn(name = "usn")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private CourseInfo courseInfo;

    public StudentCourseMapping() {
    }

    public StudentCourseMapping(String usn, String courseid, Student student, CourseInfo courseInfo) {
        this.usn = usn;
        this.courseid = courseid;
        this.student = student;
        this.courseInfo = courseInfo;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public StudentCourseMapping(String usn, String courseid) {
        this.usn = usn;
        this.courseid = courseid;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }
}
