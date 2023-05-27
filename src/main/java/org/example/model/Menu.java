package org.example.model;

import org.example.command.MenuCommand;

public class Menu {

    private final MenuCommand[] menuCommands;

    public Menu(MenuCommand[] menuCommands) {
        this.menuCommands = menuCommands;
    }

}
