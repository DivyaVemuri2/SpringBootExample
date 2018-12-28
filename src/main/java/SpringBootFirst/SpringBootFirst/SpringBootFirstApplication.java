package SpringBootFirst.SpringBootFirst;

import SpringBootFirst.SpringBootFirst.Controller.StudentController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApplication {
//	private final Logger LOGGER= LoggerFactory.getLogger(StudentController.class);
	private final Logger LOGGER=LoggerFactory.getLogger(SpringBootFirstApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstApplication.class, args);

	}

}

