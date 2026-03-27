package com.game.model.character;

import com.game.model.stats.Stats;
public class GameCharacter {
    private int health;
    private int energy;
    Stats stats;

    public GameCharacter(int health, int energy) {
        this.health = health;
        this.energy = energy;
        stats = new Stats(0,0,0);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
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
