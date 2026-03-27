package com.game.main;

import com.game.model.character.GameCharacter;
import com.game.model.ability.BasicAttack;
import com.game.model.ability.Ability;
public class Main {
    public static void main(String[] args) {
        GameCharacter character1 = new GameCharacter(100,100);
        GameCharacter character2 = new GameCharacter(100,100);
        BasicAttack basic = new BasicAttack();
        System.out.println(basic.execute(character1,character2));
    }
}
