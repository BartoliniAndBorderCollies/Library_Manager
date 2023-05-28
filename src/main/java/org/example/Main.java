package org.example;

import org.example.command.CreateAccount;
import org.example.command.MenuCommand;
import org.example.controller.AccountController;
import org.example.controller.MenuController;
import org.example.database.AccountRepository;
import org.example.service.AccountService;
import org.example.view.View;

public class Main {

    public static void main(String[] args) {

        AccountRepository accountRepository = new AccountRepository();
        AccountService accountService = new AccountService(accountRepository);
        View view = new View();

        AccountController accountController = new AccountController(accountService, view);
        CreateAccount createAccount = new CreateAccount(accountController);
        MenuController menuController = new MenuController(view, createAccount);

        menuController.run();



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