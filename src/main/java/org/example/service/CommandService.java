package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class CommandService {

    public List<String> possibleCommands = new ArrayList<>();



    private void addCommand() {
        possibleCommands.add("help");
        possibleCommands.add("create account");
    }


}
