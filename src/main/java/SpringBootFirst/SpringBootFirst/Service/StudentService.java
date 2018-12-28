
package SpringBootFirst.SpringBootFirst.Service;

//import SpringBootFirst.SpringBootFirst.Model.Course;
import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import SpringBootFirst.SpringBootFirst.Model.Student;
import SpringBootFirst.SpringBootFirst.Repository.PhoneNumberRepository;
import SpringBootFirst.SpringBootFirst.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PhoneNumberRepository studentPhoneRepository;

    @Secured({"admin","student"})
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

    public Student getBylastName(String lasstname) {
        return studentRepository.findByLastname(lasstname);

    }
/*
* UserInfo userInfo = userInfoDAO.getActiveUser(userName);
		GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRole());

		User user = new User(userInfo.getUserName(),userInfo.getPassword(),Arrays.asList(authority));

		UserDetails userDetails = (UserDetails)user;
		return userDetails;

* */
//    public UserDetails getUserByUsn(String usn){
//        Student student=studentRepository.findById(usn).get();
//        GrantedAuthority authority=new SimpleGrantedAuthority(student.g)
//
//    }
}
