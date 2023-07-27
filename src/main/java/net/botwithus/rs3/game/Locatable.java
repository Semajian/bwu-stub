package net.botwithus.rs3.game;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Locatable {
    public default double distanceTo(@NotNull Locatable target) {
        return 0.0;
    }

    public @Nullable
    default Area getArea() {
        return null;
    }

    public default @Nullable Coordinate getCoordinate() {
        return null;
    }
}