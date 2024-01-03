package com.workintech.basicsecurity.service;

import com.workintech.basicsecurity.entity.Account;
import com.workintech.basicsecurity.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Long id) {
        if (accountRepository.findById(id).isPresent()) return accountRepository.findById(id).get();
        else throw new RuntimeException("Account with the following ID is not found: " + id);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
