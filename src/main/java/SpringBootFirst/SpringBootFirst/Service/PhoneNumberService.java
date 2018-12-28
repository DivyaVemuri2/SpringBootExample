package SpringBootFirst.SpringBootFirst.Service;

import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import SpringBootFirst.SpringBootFirst.Repository.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class PhoneNumberService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    public List<PhoneNumbers> getAllPhoneNumbers(){
        return (List<PhoneNumbers>) phoneNumberRepository.findAll();
    }

    public List<PhoneNumbers> getStudentNumber(String usn){
        return phoneNumberRepository.findByUsn(usn);
    }

    public void addNumber(List<PhoneNumbers> phoneNumbers){
        phoneNumberRepository.saveAll(phoneNumbers);
    }

}
