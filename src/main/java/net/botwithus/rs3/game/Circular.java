package net.botwithus.rs3.game;

import com.sun.jdi.Locatable;
import org.jetbrains.annotations.NotNull;

public class Circular extends Area {
        public boolean contains(Locatable locatable) {
                return false;
        }

        public Circular derive(int xOffset, int yOffset, int planeOffset) {
                return null;
        }

        public Coordinate getCoordinate() {
                return null;
        }

        public double getRadius() {
                return 0.0;
        }

        public @NotNull Coordinate getRandomCoordinate() {
                return null;
        }
}
