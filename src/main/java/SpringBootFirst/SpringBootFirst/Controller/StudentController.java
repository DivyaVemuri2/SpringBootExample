package SpringBootFirst.SpringBootFirst.Controller;

//import SpringBootFirst.SpringBootFirst.Model.Course;
import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import SpringBootFirst.SpringBootFirst.Model.Student;
import SpringBootFirst.SpringBootFirst.Service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/hi")
    private String hrr(){
        LOGGER.info("**-INFO-**   Testing the log funtion");
        return "hello ";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/getStudentById/{usn}")
    public Optional<Student> getStudentById(@PathVariable("usn") String usn){
        return studentService.getStudent(usn);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateStudent/{usn}")
    public void updateStudent(@RequestBody Student student, @PathVariable("usn") java.lang.String usn){
        studentService.updateStudent(student,usn);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteStudent/{usn}")
    public void deleteStudent(@PathVariable("usn")String usn){
        studentService.deleteStudent(usn);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addNumber")
    public void addNumber(@RequestBody PhoneNumbers phoneNumbers) {
        studentService.addNumber(phoneNumbers);
    }

    @RequestMapping("/findbylastname/{lastname}")
    public Student findbylastname(@PathVariable("lastname")String lasstname){
            return studentService.getBylastName(lasstname);
    }

}
