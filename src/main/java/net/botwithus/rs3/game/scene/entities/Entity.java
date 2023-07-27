package net.botwithus.rs3.game.scene.entities;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;
import org.jetbrains.annotations.Nullable;

public class Entity {
    public boolean equals(Object o) {
        return false;
    }

    public @Nullable Area getArea() {
        return null;
    }

    public @Nullable Coordinate getCoordinate() {
        return null;
    }

    public final int getId() {
        return 1;
    }

    public final int getType() {
        return 1;
    }

    public int hashCode() {
        return 0;
    }
}