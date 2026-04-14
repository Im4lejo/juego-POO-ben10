
package com.game.model.ability.builder;

import java.util.ArrayList;


import com.game.model.ability.Ability;
import com.game.model.character.GameCharacter;
import com.game.model.character.Warrior;
import com.game.model.effects.Effect;
import com.game.model.stats.Stats;


public class GameCharacterBuilder {
    private int health;
    private int energy;
    Stats stats;
    Effect effect;
    private String name;
    private ArrayList<Ability> abilities;
    private ArrayList<Effect> effects;
    
    public GameCharacterBuilder setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
        return this;
    }

    public GameCharacterBuilder setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    public GameCharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GameCharacterBuilder setEffect(Effect effect) {
        this.effect = effect;
        return this;
    }
   
    public GameCharacterBuilder setStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    public GameCharacterBuilder setHealth(int health) {
        this.health = health;
        return this;
    }


    public GameCharacterBuilder setEnergy(int energy) {
        this.energy = energy;
        return this;
    }


    public GameCharacter build(){
        return new Warrior(health, energy,stats,effect,abilities) ;
    }


}
