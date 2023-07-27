package net.botwithus.rs3.game.js5.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface NpcType {
    public default int getCombatLevel() {
        return 0;
    }

    public @NotNull
    default NpcType getCurrentState() {
        return null;
    }

    public default int getIntParam(int paramId) {
        return 0;
    }

    public @NotNull
    default List<String> getOptions() {
        return null;
    }

    public default int getSize() {
        return 0;
    }

    public @NotNull
    default List<NpcType> getStates() {
        return null;
    }

    public @Nullable
    default String getStringParam(int paramId) {
        return null;
    }

    public default boolean hasParam(int paramId) {
        return false;
    }
}