package com.game.GameController;

import com.game.model.character.GameCharacter;
import com.game.model.ability.BasicAttack;
public class Main {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter();
        GameCharacter character2 = new GameCharacter();
        BasicAttack basic = new BasicAttack();
        Combat combat = new Combat();
        combat.selectCharacter(character1);
        combat.selectCharacter(character2);
        basic.execute(character1,character2);
        System.out.println("danio " + character2.getHealth());
    }
}
