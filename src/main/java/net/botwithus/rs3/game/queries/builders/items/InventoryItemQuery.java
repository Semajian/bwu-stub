package net.botwithus.rs3.game.queries.builders.items;

import net.botwithus.rs3.game.Item;
import net.botwithus.rs3.game.queries.results.ResultSet;
import org.jetbrains.annotations.NotNull;

public class InventoryItemQuery {
    public InventoryItemQuery ids(int... itemIds) {
        return null;
    }

    public @NotNull InventoryItemQuery inventories(int... inventoryIds) {
        return null;
    }

    public ResultSet<Item> results() {
        return null;
    }

    public InventoryItemQuery slots(int... slots) {
        return null;
    }

    public InventoryItemQuery stack(int amount) {
        return null;
    }

    public InventoryItemQuery stack(int min, int max) {
        return null;
    }
}