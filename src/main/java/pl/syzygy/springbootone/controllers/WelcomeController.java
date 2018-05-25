package pl.syzygy.springbootone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/admin/index.html")
    public String adminView() {
        return "/admin/admin";
    }

    @RequestMapping("/user/index.html")
    public String userView() {
        return "/user/user";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "loginPage";
    }


}
