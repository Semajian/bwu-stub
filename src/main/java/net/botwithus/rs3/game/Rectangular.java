package net.botwithus.rs3.game;

import com.sun.jdi.Locatable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Rectangular {
    public boolean contains(Locatable locatable) {
        return false;
    }

    public Rectangular derive(int xOffset, int yOffset, int planeOffset) {
        return null;
    }

    public Coordinate getBottomLeft() {
        return null;
    }

    public Coordinate getBottomRight() {
        return null;
    }

    public Coordinate getCoordinate() {
        return null;
    }

    public @NotNull List<Coordinate> getCoordinates() {
        return null;
    }

    public @Nullable Coordinate getRandomCoordinate() {
        return null;
    }

    public Coordinate getTopLeft() {
        return null;
    }

    public Coordinate getTopRight() {
        return null;
    }
}
