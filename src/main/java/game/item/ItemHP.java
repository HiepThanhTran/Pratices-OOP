/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.item;

/**
 * @author admin
 */
public class ItemHP extends Item {

    private static int count = 0;
    private double hp;

    {
        id = String.format("B%02d", ++count);
    }

    public ItemHP(double hp) {
        this.hp = hp;
    }

    public static int getCount() {
        return count;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("%s- HP: %.2f", super.toString(), hp);
    }
}
