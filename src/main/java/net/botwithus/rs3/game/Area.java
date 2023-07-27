package net.botwithus.rs3.game;

import com.sun.jdi.Locatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

public class Area {
    public boolean contains(Locatable locatable) {
        return false;
    }

    public @NotNull Area getArea() {
        return null;
    }

    public @Nullable Coordinate getCentroid() {
        return null;
    }

    public @NotNull List<Coordinate> getCoordinates() {
        return null;
    }

    public final Set<Coordinate> getOverlap(Area area) {
        return null;
    }

    public @NotNull Set<Coordinate> getOverlap(Area area, boolean ignorePlane) {
        return null;
    }

    public @Nullable Coordinate getRandomCoordinate() {
        return null;
    }

    public boolean overlaps(Area area, boolean ignorePlane) {
        return false;
    }

    public final boolean overlaps(Locatable locatable) {
        return false;
    }

}