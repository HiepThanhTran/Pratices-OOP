/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game.service;

import game.character.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author admin
 */
public class CharacterManager {

    private final List<Characters> charactersList = new ArrayList<>();

    public void sort() {
        Collections.sort(this.charactersList);
    }

    public void addChar(Characters characters) {
        this.charactersList.add(characters);
    }

    public void addChar(Characters... charactersList) {
        this.charactersList.addAll(Arrays.asList(charactersList));
    }

    public void removeChar(Characters characters) {
        this.charactersList.remove(characters);
    }

    public void showCharactersList() {
        this.charactersList.forEach(characters -> {
            System.out.println(characters);
            System.out.println("- Item list of characters:");
            characters.showItemList();
            System.out.println();
        });
    }
}
