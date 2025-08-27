package com.spring.profiles.controller;

import com.spring.profiles.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private RoleService roleService;

    @Value("${database.name}")
    private String databaseName;

    @GetMapping
    public String getDatabaseName() {
        return databaseName;
    }

    @GetMapping("/roles")
    public List<String> getRoles() {
        return roleService.getRoles();
    }

}
