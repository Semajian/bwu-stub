package net.botwithus.rs3.queries.builders;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.Coordinate;

public class EntityQueryBuilder<T extends EntityQueryBuilder<T>> {
    public T inside(Area area) {
        return null;
    }

    public T off(Coordinate coordinate) {
        return null;
    }

    public T on(Coordinate coordinate) {
        return null;
    }

    public T outside(Area area) {
        return null;
    }

}