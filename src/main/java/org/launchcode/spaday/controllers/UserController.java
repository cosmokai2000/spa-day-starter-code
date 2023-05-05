package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {

        @PostMapping("/add")
        public String displayUserAddForm (@RequestParam String username, String email, String password, String verify) {

        return "redirect:add.html";
    }
}
