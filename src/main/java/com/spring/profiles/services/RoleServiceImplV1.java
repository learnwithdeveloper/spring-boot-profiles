package com.spring.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("prod")
public class RoleServiceImplV1 implements RoleService{
    @Override
    public List<String> getRoles() {
        return List.of("V1 Develop Roles");
    }
}
