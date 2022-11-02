package com.dumu.mapper;

import com.dumu.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);

    public List<Account> findAll();
}
