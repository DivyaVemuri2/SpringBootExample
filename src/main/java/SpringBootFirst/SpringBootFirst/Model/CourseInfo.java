package SpringBootFirst.SpringBootFirst.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "course_info")
public class CourseInfo {
    @Id
    @Column(name = "course_id")
    private String courseid;
    @Column(name = "course_name")
    private String coursename;
    @Column(name = "credits")
    private int credits;

    public CourseInfo() {
    }

    public CourseInfo(String courseid, String coursename, int credits) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.credits = credits;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
