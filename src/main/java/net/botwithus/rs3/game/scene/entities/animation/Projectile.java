package net.botwithus.rs3.game.scene.entities.animation;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.scene.entities.Entity;
import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;

public class Projectile extends Entity {
    public Coordinate getDestination() {
        return null;
    }

    public long getEndCycle() {
        return 0;
    }

    public PathingEntity<?> getSource() {
        return null;
    }

    public double getSpeed() {
        return 0.0;
    }

    public Coordinate getStart() {
        return null;
    }

    public long getStartCycle() {
        return 0;
    }

    public PathingEntity<?> getTarget() {
        return null;
    }

    public boolean hasReachedTarget(long currentCycle) {
        return false;
    }

    public boolean isInFlight(long cycle) {
        return false;
    }

    public boolean validate() {
        return false;
    }
}