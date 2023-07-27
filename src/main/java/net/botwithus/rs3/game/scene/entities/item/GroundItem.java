package net.botwithus.rs3.game.scene.entities.item;

import net.botwithus.rs3.game.js5.types.ItemType;
import net.botwithus.rs3.game.minimenu.actions.GroundItemAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GroundItem {
    public boolean equals(Object o) {
        return false;
    }

    public @Nullable ItemType getConfigType() {
        return null;
    }

    public @Nullable String getName() {
        return null;
    }

    public @NotNull List<String> getOptions() {
        return null;
    }

    public int getStackSize() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean interact(int typeId) {
        return false;
    }

    public boolean interact(GroundItemAction type) {
        return false;
    }

    public boolean validate() {
        return false;
    }
}