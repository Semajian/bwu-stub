package net.botwithus.rs3.game.js5.types;

public interface EffectType {
    public default int getAnimationId() {
        return 0;
    }

    public default int getModelId() {
        return 0;
    }
}