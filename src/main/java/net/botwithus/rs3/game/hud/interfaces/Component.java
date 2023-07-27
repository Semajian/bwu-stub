package net.botwithus.rs3.game.hud.interfaces;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.BitSet;
import java.util.List;
import java.util.function.Function;

public class Component {
    public boolean equals(Object o) {
        return false;
    }

    public int getComponentIndex() {
        return 0;
    }

    public int getInterfaceIndex() {
        return 0;
    }

    public int getItemAmount() {
        return 0;
    }

    public int getItemId() {
        return 0;
    }

    public @NotNull List<String> getOptions() {
        return null;
    }

    public BitSet getProperties() {
        return null;
    }

    public int getSpriteId() {
        return 0;
    }

    public int getSubComponentIndex() {
        return 0;
    }

    public String getText() {
        return null;
    }

    public int getTextAlpha() {
        return 0;
    }

    public Color getTextColor() {
        return null;
    }

    public int getTextFontId() {
        return 0;
    }

    public ComponentType getType() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean interact() {
        return false;
    }

    public boolean interact(int option) {
        return false;
    }

    public boolean interact(@NotNull Integer option) {
        return false;
    }

    public void setOptionMapper(Function<Integer, Integer> mapper) {
    }

    public String toString() {
        return null;
    }
}