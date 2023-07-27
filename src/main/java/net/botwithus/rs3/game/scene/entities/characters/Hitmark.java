package net.botwithus.rs3.game.scene.entities.characters;

public interface Hitmark {
    public default int getDamage() {
        return 0;
    }
}