
package SpringBootFirst.SpringBootFirst.Service;

//import SpringBootFirst.SpringBootFirst.Model.Course;
import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import SpringBootFirst.SpringBootFirst.Model.Student;
import SpringBootFirst.SpringBootFirst.Repository.StudentPhoneRepository;
import SpringBootFirst.SpringBootFirst.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentPhoneRepository studentPhoneRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStudent(String usnno){
        return studentRepository.findById(usnno);
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void updateStudent(Student student, java.lang.String usnno) {
        studentRepository.save(student);
    }
    public void deleteStudent(String usn){
        studentRepository.deleteById(usn);
    }

    public void addNumber(PhoneNumbers phoneNumbers){
        studentPhoneRepository.save(phoneNumbers);
    }
}
