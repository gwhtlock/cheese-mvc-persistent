package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class AddMenuItemForm {

    private Menu menu;

    @NotNull
    private int MenuId;

    @NotNull
    private int cheeseId;

    private Iterable<Cheese> cheeses;

    public AddMenuItemForm(){

    }

    public AddMenuItemForm(Menu aMenu, Iterable<Cheese> aCheeses){

        this.menu = aMenu;
        this.cheeses = aCheeses;

    }



    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getMenuId() {
        return MenuId;
    }

    public void setMenuId(int menuId) {
        MenuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }
}
