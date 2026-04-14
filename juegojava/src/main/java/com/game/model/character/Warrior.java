package com.game.model.character;


import com.game.model.ability.Ability;
import com.game.model.effects.Effect;
import com.game.model.stats.Stats;
import java.util.ArrayList;


public class Warrior extends GameCharacter {
   
    public Warrior(int health, int energy, Stats stats, Effect effect, ArrayList<Ability> abilities) {
        super(health, energy, stats, effect, abilities);
    }
   
}
