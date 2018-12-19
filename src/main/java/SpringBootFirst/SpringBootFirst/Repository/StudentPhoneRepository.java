package SpringBootFirst.SpringBootFirst.Repository;

import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import org.springframework.data.repository.CrudRepository;

public interface StudentPhoneRepository extends CrudRepository<PhoneNumbers, Integer> {
}
