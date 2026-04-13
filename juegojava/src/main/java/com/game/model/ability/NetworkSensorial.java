package com.game.model.ability;

import effects.SplixsonSpecialEffect;
import com.game.model.character.GameCharacter;

public class  NetworkSensorial  implements Ability{

    @Override
    public double execute (GameCharacter attacker, GameCharacter target){
        target.addEffect(new SplixsonSpecialEffect(3));
        return 0;
    }
    
}
