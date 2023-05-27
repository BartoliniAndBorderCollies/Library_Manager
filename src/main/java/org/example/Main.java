package org.example;

import org.example.command.CreateAccount;
import org.example.command.MenuCommand;
import org.example.controller.AccountController;
import org.example.database.AccountRepository;
import org.example.entity.Account;
import org.example.service.AccountService;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        AccountRepository accountRepository = new AccountRepository(account);
        AccountService accountService = new AccountService(accountRepository);
        AccountController accountController = new AccountController(accountService);

        MenuCommand[] menuCommands = {

                new CreateAccount(accountController)

        };


//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        // Check database version (because there is nothing else in database)
//        String sql = "select version()";
//
//        String result = (String) session.createNativeQuery(sql).getSingleResult();
//        System.out.println(result);
//        session.close();
//
//        HibernateUtil.shutdown();
    }

}