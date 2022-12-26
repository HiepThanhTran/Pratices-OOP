package game;

import game.character.Characters;
import game.item.Item;
import game.item.ItemHP;
import game.item.ItemIncreaseTurn;
import game.service.CharacterManager;

public class Game {

    public static void main(String[] args) {
        CharacterManager characterManager = new CharacterManager();
        Characters c1 = new Characters("Hiep");
        Item i1 = new ItemIncreaseTurn(5);
        Item i2 = new ItemHP(3000);
        c1.addItem(i1, i2);
        System.out.printf("Total number of turns of the character %d: %d", c1.getId(), c1.getTotalTurn());

        Characters c2 = new Characters("Hien");
        Item i3 = new ItemIncreaseTurn(10);
        Item i4 = new ItemHP(5000);
        c2.addItem(i3, i4);
        System.out.printf("Total number of turns of the character %d: %d", c2.getId(), c2.getTotalTurn());

        Characters c3 = new Characters("Phuc");
        Item i5 = new ItemIncreaseTurn(37);
        c3.addItem(i5);
        System.out.printf("Total number of turns of the character %d: %d", c3.getId(), c3.getTotalTurn());

        Characters c4 = new Characters("Nhu");
        Item i7 = new ItemIncreaseTurn(23);
        Item i8 = new ItemHP(10000);
        c4.addItem(i7, i8);
        System.out.printf("Total number of turns of the character %d: %d", c4.getId(), c4.getTotalTurn());

        Characters c5 = new Characters("Hau");
        Item i9 = new ItemIncreaseTurn(15);
        Item i10 = new ItemHP(7000);
        c5.addItem(i9, i10);
        System.out.printf("Total number of turns of the character %d: %d", c5.getId(), c5.getTotalTurn());

        characterManager.addChar(c1, c2, c3, c4, c5);

        System.out.println("\n== BEFORE SORT ==");
        characterManager.showCharactersList();

        System.out.println("\n== AFTER SORT ==");
        characterManager.sort();
        characterManager.showCharactersList();
    }
}
