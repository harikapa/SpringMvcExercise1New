package com.stackroute.SpringMvcExercise1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("/")
        public String greet(Model model){
        User u = new User("Harika");
        model.addAttribute("name",u.getName());
        return "index";

    }
}

