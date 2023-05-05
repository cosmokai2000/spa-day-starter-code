package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("user")
public class UserController {

    @PostMapping("/add")
    public String displayUserAddForm () {
    return "/add";
    }

//    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
//        // add form submission handling code here
//    }
}
