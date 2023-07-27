package net.botwithus.rs3.game.js5.types.vars;

public interface VarType {
    public default VarTransmitLevel getClientTransmitLevel() {
        return null;
    }

    public default ScriptVarType getDataType() {
        return null;
    }

    public default VarDomainType getDomain() {
        return null;
    }

    public default VarLifetime getLifetime() {
        return null;
    }
}