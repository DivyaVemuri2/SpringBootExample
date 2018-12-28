package SpringBootFirst.SpringBootFirst.Controller;


import SpringBootFirst.SpringBootFirst.Model.PhoneNumbers;
import SpringBootFirst.SpringBootFirst.Service.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phno")
public class PhoneNumberController {

    @Autowired
    private PhoneNumberService phoneNumberService;

    @RequestMapping("/getAll")
    public List<PhoneNumbers> getallnumbers(){
        return phoneNumberService.getAllPhoneNumbers();
    }

    @RequestMapping("/getStudentNumber/{usn}")
    public List<PhoneNumbers> getStudentNumber(@PathVariable("usn") String usn){
        return phoneNumberService.getStudentNumber(usn);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addNumber")
    public void addNumber(@RequestBody List<PhoneNumbers> phoneNumbers){
        phoneNumberService.addNumber(phoneNumbers);
    }


}
