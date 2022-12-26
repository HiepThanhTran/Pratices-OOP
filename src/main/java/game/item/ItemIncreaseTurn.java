/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.item;

/**
 * @author admin
 */
public class ItemIncreaseTurn extends Item {

    private static int count = 0;
    private int value;

    {
        id = String.format("A%02d", ++count);
    }

    public ItemIncreaseTurn(int value) {
        this.value = value;
    }

    public static int getCount() {
        return count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s- Value: %d", super.toString(), value);
    }
}
