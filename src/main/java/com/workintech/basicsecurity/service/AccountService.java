package com.workintech.basicsecurity.service;

import com.workintech.basicsecurity.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
}
