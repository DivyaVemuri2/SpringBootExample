package SpringBootFirst.SpringBootFirst.Repository;

import SpringBootFirst.SpringBootFirst.Model.CourseInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseInfoRepository extends CrudRepository<CourseInfo, String> {

}
