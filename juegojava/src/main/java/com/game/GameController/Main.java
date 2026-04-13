package com.game.GameController;

import com.game.model.ability.skills.BasicAttack;
import com.game.model.character.GameCharacter;
public class Main {
    public static void main(String[] args) {
        BasicAttack basic = new BasicAttack();
        Combat combat = new Combat();
        
        GameCharacter charactern = combat.selectCharacter();
        GameCharacter characterm = combat.selectCharacter();
        double danio = basic.execute(charactern,characterm);
        System.out.println("danio " + danio + " " + characterm.getHealth());
    }
}
