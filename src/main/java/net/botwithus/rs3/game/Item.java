package net.botwithus.rs3.game;

import net.botwithus.rs3.game.js5.types.InventoryType;
import net.botwithus.rs3.game.js5.types.ItemType;
import org.jetbrains.annotations.Nullable;

public class Item {
    public boolean equals(Object o) {
        return false;
    }

    public @Nullable ItemType getConfigType() {
        return null;
    }

    public int getId() {
        return 0;
    }

    public @Nullable InventoryType getInventory() {
        return null;
    }

    public @Nullable String getName() {
        return null;
    }

    public int getSlot() {
        return 0;
    }

    public int getStackSize() {
        return 0;
    }

    public int getVarbitValue(int varbitId) {
        return 0;
    }

    public int hashCode() {
        return 0;
    }
}