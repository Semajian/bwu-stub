package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.Item;

import java.util.List;

public interface InventoryType {
    public default int getCapacity() {
        return 0;
    }

    public default List<Item> getStockItems() {
        return null;
    }
}

