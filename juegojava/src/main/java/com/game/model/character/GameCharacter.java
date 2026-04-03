package com.game.model.character;

import com.game.model.stats.Stats;
public class GameCharacter {
    private int health;
    private int energy;
    Stats stats;

    public void setStats(double damageLevel,double defense, double agility) {
        this.stats = new Stats(damageLevel,defense,agility);
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

}
