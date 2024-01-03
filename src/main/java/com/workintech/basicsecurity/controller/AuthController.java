package com.workintech.basicsecurity.controller;

import com.workintech.basicsecurity.dto.RegistrationMember;
import com.workintech.basicsecurity.entity.user.Member;
import com.workintech.basicsecurity.service.AuthenticationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public Member register(@RequestBody RegistrationMember registrationMember) {
        return authenticationService.register(registrationMember.email(), registrationMember.password());
    }
}
