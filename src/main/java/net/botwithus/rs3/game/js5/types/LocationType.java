package net.botwithus.rs3.game.js5.types;

import java.util.List;

public interface LocationType {
    public default int getIntParam(int paramId) {
        return 0;
    }

    public default List<String> getOptions() {
        return null;
    }

    public default String getStringParam(int paramId) {
        return null;
    }

    public default boolean hasParam(int paramId) {
        return false;
    }
}