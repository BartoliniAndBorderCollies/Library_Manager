package org.example.controller;

import org.example.service.AccountService;

public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    public void create(){
        accountService.create();
    }
}
