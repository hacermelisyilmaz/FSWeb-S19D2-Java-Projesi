package com.workintech.basicsecurity.service;

import com.workintech.basicsecurity.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account findById(Long id);
    Account save(Account account);
}
