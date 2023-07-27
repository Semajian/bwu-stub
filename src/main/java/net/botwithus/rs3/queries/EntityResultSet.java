package net.botwithus.rs3.queries;

import net.botwithus.rs3.game.Coordinate;
import net.botwithus.rs3.game.scene.entities.Entity;

public class EntityResultSet<T extends Entity> {
    public T nearest() {
        return null;
    }

    public T nearestTo(Coordinate coordinate) {
        return null;
    }

    public T nearestTo(Entity entity) {
        return null;
    }
}