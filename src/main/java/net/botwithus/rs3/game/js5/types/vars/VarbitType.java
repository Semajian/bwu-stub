package net.botwithus.rs3.game.js5.types.vars;

public interface VarbitType {
    public default VarDomainType getDomainType() {
        return null;
    }
}