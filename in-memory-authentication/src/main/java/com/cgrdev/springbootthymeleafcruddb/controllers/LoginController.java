package com.cgrdev.springbootthymeleafcruddb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/show-login-page")
    public String showLogin() {
        return "login/login-form";
    }

    // request mapping for access-denied
    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "login/access-denied";
    }

}
