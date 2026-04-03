package com.game.model.ability;
import com.game.model.character.GameCharacter;

import com.game.model.stats.Stats;
public class BasicAttack implements Ability {

    @Override
    public double execute(GameCharacter attacker, GameCharacter target){       
        Stats statsAttacker = attacker.getStats();
        Stats statsTarget = target.getStats();
        double reduction = statsTarget.getDefense() / (statsTarget.getDefense()+ 100);
        double finalDamage = statsAttacker.getDamageLevel() * (1-reduction);
        target.setHealth((int) (target.getHealth() - Math.round(finalDamage)));
        return finalDamage;
    }

}
