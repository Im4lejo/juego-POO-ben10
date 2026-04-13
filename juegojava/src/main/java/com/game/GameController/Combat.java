package com.game.GameController;

import com.game.model.ability.Ability;
import effects.Effect;
import com.game.model.ability.NetworkSensorial;
import effects.SplixsonSpecialEffect;
import com.game.model.ability.skills.BasicAttack;
import com.game.model.character.GameCharacter;
import com.game.model.character.Splixson;
import com.game.model.stats.Stats;
import java.util.ArrayList;

public class Combat {
    Ability basicDamage = new BasicAttack();
    //Ability MidDamage = new BasicAttack();
    /*Special Abilities*/
    
    Ability networkSensorial = new NetworkSensorial();
    ArrayList <GameCharacter> gameCharactersList;
    Stats splixsonStats = new Stats(30,40,50);
    ArrayList <Ability> splixsonAbilities = new ArrayList<>();

    Effect splixsonEffect = new SplixsonSpecialEffect(3);
    GameCharacter splixson = new Splixson(80,90,splixsonStats,splixsonEffect,splixsonAbilities, "Splixson");

    public Combat() {
        this.gameCharactersList = new ArrayList<>();
        // adding characterists of Splixson 
        gameCharactersList.add(splixson);
        splixsonAbilities.add(basicDamage);
        splixsonAbilities.add(networkSensorial);
    }
    public GameCharacter selectCharacter(){
        GameCharacter selectedCharacter = splixson;
        return selectedCharacter;
    }
}
