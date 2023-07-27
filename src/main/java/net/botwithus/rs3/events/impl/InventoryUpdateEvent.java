package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.game.Item;

public class InventoryUpdateEvent {

    public int getInventoryId() {
        return 0;
    }

    public Item getNewItem() {
        return null;
    }

    public Item getOldItem() {
        return null;
    }

    public int getSlot() {
        return 0;
    }

}