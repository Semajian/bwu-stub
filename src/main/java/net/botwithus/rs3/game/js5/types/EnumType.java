package net.botwithus.rs3.game.js5.types;

import net.botwithus.rs3.game.js5.types.vars.ScriptVarType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface EnumType {
    public default int getEntryCount() {
        return 0;
    }

    public @Nullable
    default Integer getInput(Object output) {
        return null;
    }

    public @NotNull
    default List<Integer> getInputs() {
        return null;
    }

    public default ScriptVarType getInputType() {
        return null;
    }

    public default int getIntDefault() {
        return 0;
    }

    public @Nullable
    default Object getOutput(int input) {
        return null;
    }

    public @NotNull
    default List<Object> getOutputs() {
        return null;
    }

    public default ScriptVarType getOutputType() {
        return null;
    }

    public default String getStringDefault() {
        return null;
    }
}