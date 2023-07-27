package net.botwithus.rs3.game.annotations;

public interface Validatable {
    public default boolean validate() {
        return false;
    }
}