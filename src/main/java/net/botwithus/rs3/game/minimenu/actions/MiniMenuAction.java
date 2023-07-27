package net.botwithus.rs3.game.minimenu.actions;

public interface MiniMenuAction {
    public default int getType() {
        return 0;
    }
}