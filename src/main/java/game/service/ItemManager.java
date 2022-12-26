/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.service;

import game.item.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 */
public class ItemManager {

    private final List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void addItem(Item... itemList) {
        this.itemList.addAll(Arrays.asList(itemList));
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }
}
