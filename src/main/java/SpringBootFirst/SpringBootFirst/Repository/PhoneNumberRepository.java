package SpringBootFirst.SpringBootFirst.Repository;

import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneNumberRepository extends CrudRepository<PhoneNumbers, Integer> {
    List<PhoneNumbers> findByUsn(String usn);

}
