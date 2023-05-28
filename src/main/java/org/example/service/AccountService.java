package org.example.service;
import org.example.database.AccountRepository;
import org.example.entity.Account;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account create(Account account) {
        accountRepository.create(account);
        return account;
    }
}
