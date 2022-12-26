/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.item;

/**
 * @author admin
 */
public abstract class Item {

    private static int amount = 0;
    protected String id;

    {
        amount++;
    }

    public static int getAmount() {
        return amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("== Item information with ID %s ==\n", id);
    }
}