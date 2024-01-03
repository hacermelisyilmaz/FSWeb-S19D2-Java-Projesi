package com.workintech.basicsecurity.service;

import com.workintech.basicsecurity.entity.user.Member;
import com.workintech.basicsecurity.repository.MemberRepository;
import com.workintech.basicsecurity.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class AuthenticationService {
    private final MemberRepository memberRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public Member register(String email, String password) {
        Optional<Member> foundMember = memberRepository.findByEmail(email);
        if (foundMember.isPresent()) throw new RuntimeException("User with the following email already exists: " + email);

    }
}
