package org.example.controller;

import org.example.command.CreateAccount;
import org.example.view.View;

import java.util.Scanner;

public class MenuController {

    private static final String WELCOME = """
            Welcome to Library Manager application.
            
            Type a command. For help type "help"
            """;
    private static final String USER_COMMAND = "Command:";
    private final View view;
    private final CreateAccount createAccount;


    public MenuController(View view, CreateAccount createAccount) {
        this.view = view;
        this.createAccount = createAccount;
    }

    public void run() {
        view.update(WELCOME);
        String userInput = askForInput(USER_COMMAND);

        if(userInput.equalsIgnoreCase("create account")) {
            createAccount.execute();
        }
    }

    public String askForInput(String userInput) {
        Scanner scanner = new Scanner(System.in);

        view.update(userInput);
        return scanner.nextLine();
    }


    private void showListOfCommands(String input) {



    }





}
