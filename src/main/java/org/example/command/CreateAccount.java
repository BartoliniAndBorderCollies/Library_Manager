package org.example.command;

import org.example.controller.AccountController;

public class CreateAccount implements MenuCommand {

    private final AccountController accountController;

    public CreateAccount(AccountController accountController) {
        this.accountController = accountController;
    }

    @Override
    public void execute() {
        accountController.create();
    }
}
