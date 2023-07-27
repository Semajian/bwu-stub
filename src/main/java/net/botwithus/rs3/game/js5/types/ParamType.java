package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.js5.types.vars.ScriptVarType;

public interface ParamType {
    public default int getDefaultInt() {
        return 0;
    }

    public default String getDefaultString() {
        return null;
    }

    public default ScriptVarType getVarType() {
        return null;
    }

    public default boolean isString() {
        return false;
    }
}