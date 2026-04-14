/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.game.model.effects;

import com.game.model.character.GameCharacter;


public class SplixsonSpecialEffect implements Effect{
    private String effectName = "Network Sensorial";
    private int turns = 3;
    public String getEffectName() {
        return effectName;
    }

    public SplixsonSpecialEffect(int turns) {
        this.turns = turns;
    }

    public void setEffectName(String effectName) {
        this.effectName = effectName;
    }
    @Override
    public double applyEffect(GameCharacter target, boolean isUsingItemValid, boolean isDefenseValid,boolean isChangeCharacterValid) { 
            isUsingItemValid = true;
            isDefenseValid = true;
            isChangeCharacterValid = false;
            turns--;
            return 0;

    }
}
