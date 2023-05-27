package org.example.controller;

import org.example.model.Menu;
import org.example.view.MenuView;

public class MenuController {

    private final Menu menu;

    private final MenuView menuView;

    public MenuController(Menu menu, MenuView menuView) {
        this.menu = menu;
        this.menuView = menuView;
    }


}
