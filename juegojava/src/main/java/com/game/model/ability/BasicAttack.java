package com.game.model.ability;
import com.game.model.character.GameCharacter;

import com.game.model.stats.Stats;
public class BasicAttack implements Ability {

    @Override
    public double execute(GameCharacter character1, GameCharacter character2){
        Stats stats = new Stats(0,0,0);
        return stats.getDamageLevel() +5;
    }

}
