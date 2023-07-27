package net.botwithus.rs3.game.annotations;

interface Identifiable {
    public default int getId() {
        return 0;
    }
}