package SpringBootFirst.SpringBootFirst.Repository;

import SpringBootFirst.SpringBootFirst.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,String> {
//    Student findByFirstnameAndLastName(String fristname, String lastname);
}
