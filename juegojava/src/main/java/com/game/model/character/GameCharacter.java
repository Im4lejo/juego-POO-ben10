package com.game.model.character;

import com.game.model.ability.Ability;
import effects.Effect;
import com.game.model.stats.Stats;
import java.util.ArrayList;
public abstract class GameCharacter {
    private int health;
    private int energy;
    Stats stats;
    Effect effect;
    private String name;
    private ArrayList<Ability> abilities;
    private ArrayList<Effect> effects;
    public GameCharacter(int health, int energy, Stats stats, Effect effect, ArrayList<Ability> abilities) {
        this.health = health;
        this.energy = energy;
        this.stats = stats;
        this.effect = effect;
        this.abilities = abilities;
    }

    public void setEffects(ArrayList<Effect> effects) {
        this.effects = effects;
    }

    public ArrayList<Effect> getEffects() {
        return effects;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }
    
    public void setStats(Stats stats) {
        this.stats = stats;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public int getEnergy() {
        return energy;
    }

    public Stats getStats() {
        return stats;
    }
    public void addEffect(Effect effect){
        effects.add(effect);
    }

}
