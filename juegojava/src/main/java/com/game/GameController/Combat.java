package com.game.GameController;

import com.game.model.character.GameCharacter;
import com.game.model.character.Splixson;
import java.util.ArrayList;

public class Combat {

    ArrayList <GameCharacter> gameCharactersList;
    GameCharacter splixson = new Splixson();

    public Combat() {
        this.gameCharactersList = new ArrayList<>();
        gameCharactersList.add(splixson);
    }
    public GameCharacter selectCharacter(GameCharacter selectedCharacter){
        selectedCharacter = new Splixson();
        return selectedCharacter;
    }
}
