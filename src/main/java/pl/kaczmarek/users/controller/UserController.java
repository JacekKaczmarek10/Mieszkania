package pl.kaczmarek.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kaczmarek.users.service.UserServiceImpl;

@Controller
@RestController
public class UserController {


    @Autowired
    UserServiceImpl userService;

    @PostMapping("/add-user")
    public String addUser(String firstName, String lastName, String phone, String email){
        userService.add_user(firstName, lastName, phone, email);
        return "użytkownik dodany";
    }

    @GetMapping("/showAddUserFrom")
    public String showAddUserFrom(){

        return "add_user";
    }
}
