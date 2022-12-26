/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.character;

import game.item.Item;
import game.item.ItemIncreaseTurn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 */
public class Characters implements Comparable<Characters> {

    private static int count = 0;
    private int id;
    private String name;
    private List<Item> itemList = new ArrayList<>();

    {
        id = ++count;
    }

    public Characters(String name) {
        this.name = name;
    }

    public Characters(String name, Item... itemList) {
        this.name = name;
        this.itemList.addAll(Arrays.asList(itemList));
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public int getTotalTurn() {
        return this.itemList.stream().filter(item -> item instanceof ItemIncreaseTurn)
            .mapToInt(item -> ((ItemIncreaseTurn) item).getValue()).sum();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void addItem(Item... itemList) {
        this.itemList.addAll(Arrays.asList(itemList));
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public void showItemList() {
        this.itemList.forEach(item -> System.out.println(item));
    }

    @Override
    public int compareTo(Characters o) {
        return o.getItemList().size() - this.itemList.size();
    }

    @Override
    public String toString() {
        return String.format("- ID: %d\n- Name: %s", id, name);
    }
}
