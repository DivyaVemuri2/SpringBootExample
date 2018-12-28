package SpringBootFirst.SpringBootFirst.Service;

import SpringBootFirst.SpringBootFirst.Model.CourseInfo;
import SpringBootFirst.SpringBootFirst.Repository.CourseInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInfoService {
    @Autowired
    private CourseInfoRepository courseInfoRepository;

    public List<CourseInfo> getAllCourses(){
        return (List<CourseInfo>) courseInfoRepository.findAll();
    }

    public CourseInfo getCourseInfo(String course_id){
        return courseInfoRepository.findById(course_id).get();
    }

    public void addCourse(CourseInfo courseInfo){
        courseInfoRepository.save(courseInfo);
    }

    public void deleteCourse(String course_id){
        courseInfoRepository.delete(courseInfoRepository.findById(course_id).get());
    }

}
