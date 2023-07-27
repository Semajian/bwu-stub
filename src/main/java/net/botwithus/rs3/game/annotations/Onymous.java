package net.botwithus.rs3.game.annotations;

import org.jetbrains.annotations.Nullable;

public interface Onymous {
    public @Nullable
    default String getName() {
        return null;
    }
}