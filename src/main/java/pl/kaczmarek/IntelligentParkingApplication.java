package pl.kaczmarek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.kaczmarek.users.service.UserService;
import pl.kaczmarek.users.service.UserServiceImpl;

@SpringBootApplication
public class IntelligentParkingApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligentParkingApplication.class, args);
    }



}
