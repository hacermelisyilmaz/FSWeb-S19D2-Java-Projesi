package com.workintech.basicsecurity.repository;

import com.workintech.basicsecurity.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
