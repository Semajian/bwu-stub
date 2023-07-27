package net.botwithus.rs3.game;

import com.sun.jdi.Locatable;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Singular {
    public boolean contains(Locatable locatable) {
        return false;
    }

    public Coordinate getCoordinate() {
        return null;
    }

    public @NotNull List<Coordinate> getCoordinates() {
        return null;
    }
}
