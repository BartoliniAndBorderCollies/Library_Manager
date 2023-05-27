package org.example.service;
import org.example.database.AccountRepository;

public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void create() {
        accountRepository.create();
    }
}
