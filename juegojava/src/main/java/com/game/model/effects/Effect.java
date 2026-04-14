package com.game.model.effects;

import com.game.model.character.GameCharacter;

public interface Effect {
        public double applyEffect(GameCharacter target,boolean isUseItemValid, boolean isDefenseValid,boolean isChangeCharacterValid);
}
