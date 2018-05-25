package pl.syzygy.springbootone.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.syzygy.springbootone.model.User;
import pl.syzygy.springbootone.service.SecurityService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleRestController {
    private SecurityService service;

    public SampleRestController(final SecurityService service) {
        this.service = service;
    }

    @RequestMapping("/public/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        return users;
    }
}
