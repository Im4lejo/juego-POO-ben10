package com.game.model.ability;

import com.game.model.character.GameCharacter;

public interface Ability {
    public double execute(GameCharacter character1, GameCharacter character2);
}
