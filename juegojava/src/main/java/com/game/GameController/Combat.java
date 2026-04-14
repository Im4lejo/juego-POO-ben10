package com.game.GameController;

import com.game.model.ability.Ability;
import com.game.model.ability.NetworkSensorial;
import com.game.model.ability.builder.GameCharacterBuilder;
import com.game.model.ability.skills.BasicAttack;
import com.game.model.character.GameCharacter;
import com.game.model.character.Splixson;
import com.game.model.effects.Effect;
import com.game.model.effects.SplixsonSpecialEffect;
import com.game.model.stats.Stats;
import com.game.model.effects.Effect;
import com.game.model.effects.SplixsonSpecialEffect;
import java.util.ArrayList;


public class Combat {
    GameCharacter splixson;
    Ability basicDamage = new BasicAttack();
    //Ability MidDamage = new BasicAttack();
    /*Special Abilities*/
   
    Ability networkSensorial = new NetworkSensorial();


    /*Adding design patterns ---builder---*/
    Effect targetEffect;
    ArrayList <Ability> splixsonAbilities = new ArrayList<>();


    ArrayList <GameCharacter> gameCharactersList;
    Stats splixsonStats = new Stats(30,40,50);


    public Combat() {
        this.gameCharactersList = new ArrayList<>();
        
        gameCharactersList.add(splixson);
        
        // adding characterists of Splixson
            GameCharacterBuilder splixsonBuilder = new GameCharacterBuilder();
            splixsonBuilder.setHealth(80);
            splixsonBuilder.setEnergy(90);
            splixsonBuilder.setName("Splixson");
            splixsonBuilder.setAbilities(splixsonAbilities);
            splixsonBuilder.setStats(splixsonStats);
            splixsonBuilder.setEffect(targetEffect);
            splixsonAbilities.add(basicDamage);
            splixsonAbilities.add(networkSensorial);
            
            splixson = splixsonBuilder.build();
            

            

    }
    public GameCharacter selectCharacter(){
        GameCharacter selectedCharacter = splixson;
        return selectedCharacter;
    }
}
