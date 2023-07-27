package net.botwithus.rs3.game.scene.entities.object;

import net.botwithus.rs3.game.js5.types.LocationType;
import net.botwithus.rs3.game.minimenu.actions.ObjectAction;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

public class SceneObject extends Entity {
    public boolean equals(Object o) {
        return false;
    }

    public @Nullable LocationType getConfigType() {
        return null;
    }

    public Function<Integer, ObjectAction> getDefaultMapper() {
        return null;
    }

    public @Nullable String getName() {
        return null;
    }

    public @NotNull List<String> getOptions() {
        return null;
    }

    public int getRotation() {
        return 0;
    }

    public int getShape() {
        return 0;
    }

    public int hashCode() {
        return 0;
    }

    public boolean interact(int typeId) {
        return false;
    }

    public boolean interact(ObjectAction type) {
        return false;
    }

    public boolean isHidden() {
        return false;
    }

    public boolean validate() {
        return false;
    }
}