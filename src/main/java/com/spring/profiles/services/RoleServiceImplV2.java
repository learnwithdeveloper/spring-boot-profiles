package com.spring.profiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Profile("dev")
@Component
public class RoleServiceImplV2 implements RoleService {
    @Override
    public List<String> getRoles() {
        return List.of("Testing New Features Role");
    }
}
