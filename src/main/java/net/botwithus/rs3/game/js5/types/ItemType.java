package net.botwithus.rs3.game.js5.types;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface ItemType {
    public @NotNull
    default List<String> getBackpackOptions() {
        return null;
    }

    public default int getCategory() {
        return 0;
    }

    public default long getCost() {
        return 0;
    }

    public default int getEquipmentSlotId() {
        return 0;
    }

    public default int getGrandExchangeBuyLimit() {
        return 0;
    }

    public @NotNull
    default List<String> getGroundOptions() {
        return null;
    }

    public default int getIntParam(int paramId) {
        return 0;
    }

    public @NotNull
    default List<String> getInventoryOptions(InventoryType inventoryType) {
        return null;
    }

    public @NotNull
    default boolean getStackability() {
        return false;
    }

    public default String getStringParam(int paramId) {
        return null;
    }

    public default boolean hasParam(int paramId) {
        return false;
    }

    public default boolean isMembersOnly() {
        return false;
    }
}