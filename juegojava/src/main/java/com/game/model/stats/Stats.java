
package com.game.model.stats;


public class Stats{
    private double damageLevel;
    private double defense;
    private double agility;
    public Stats (double damageLevel,double defense, double agility){
        this.agility = agility;
        this.damageLevel = damageLevel;
        this.defense = defense;
    }

    public double getDamageLevel() {
        return damageLevel;
    }

    public double getDefense() {
        return defense;
    }

    public double getAgility() {
        return agility;
    }

    public void setDamageLevel(double damageLevel) {
        this.damageLevel = damageLevel;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }
    
}
