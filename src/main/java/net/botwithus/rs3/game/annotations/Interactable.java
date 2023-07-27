package net.botwithus.rs3.game.annotations;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public interface Interactable<T> {
    public default Function<Integer, T> getDefaultMapper() {
        return null;
    }

    public @NotNull
    default List<String> getOptions() {
        return null;
    }

    public default boolean interact(int option) {
        return false;
    }

    public default boolean interact(String option) {
        return false;
    }

    public default boolean interact(String option, BiFunction<String, CharSequence, Boolean> spred) {
        return false;
    }

    public default boolean interact(String option, BiFunction<String, CharSequence, Boolean> spred, Function<Integer, T> typeMapper) {
        return false;
    }

    public default boolean interact(T type) {
        return false;
    }
}