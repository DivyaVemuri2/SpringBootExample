package SpringBootFirst.SpringBootFirst.Controller;

import SpringBootFirst.SpringBootFirst.Model.CourseInfo;
import SpringBootFirst.SpringBootFirst.Service.CourseInfoService;
import SpringBootFirst.SpringBootFirst.Service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseInfoService courseInfoService;

    @RequestMapping("/getAllCourses")
    public List<CourseInfo> getAllCourses()
    {
        return courseInfoService.getAllCourses();
    }

    @RequestMapping("/getCourseInfo/{course_id}")
    public CourseInfo getCourseInfo(@PathVariable("course_id") String course_id){
        return courseInfoService.getCourseInfo(course_id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addCourse")
    public void addCourse(@RequestBody CourseInfo courseInfo){
        courseInfoService.addCourse(courseInfo);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/deleteCourse/{course_id}")
    public void deleteCourse(@PathVariable("course_id") String course_id){
        courseInfoService.deleteCourse(course_id);
    }
}
