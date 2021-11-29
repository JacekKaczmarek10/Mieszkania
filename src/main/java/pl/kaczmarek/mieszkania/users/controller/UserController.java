package pl.kaczmarek.mieszkania.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

import pl.kaczmarek.mieszkania.users.model.User;
import pl.kaczmarek.mieszkania.users.service.UserServiceImpl;

@Controller
public class UserController {


    @Autowired
    UserServiceImpl userService;

    @PostMapping("/add-user")
    public String addUser(@Valid User user,
                          BindingResult result, Model model){
        userService.add_user(user.getFirstName(), user.getLastName(), user.getPhone(), user.getEmail());
        return "użytkownik dodany";
    }

    @GetMapping("/showAddUserForm")
    public String showAddUserFrom(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "add_user";
    }
}
