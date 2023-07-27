package net.botwithus.rs3.game.scene.entities.characters;

import net.botwithus.rs3.game.js5.types.SequenceType;
import net.botwithus.rs3.game.minimenu.actions.MiniMenuAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PathingEntity<T extends MiniMenuAction> {
    public boolean equals(Object o) {
        return false;
    }

    public int getAnimationId() {
        return 0;
    }

    public @Nullable SequenceType getAnimationType() {
        return null;
    }

    public int getCombatLevel() {
        return 0;
    }

    public int getCurrentHealth() {
        return 0;
    }

    public final @NotNull List<Headbar> getHeadbars() {
        return null;
    }

    public final @NotNull List<Hitmark> getHitmarks() {
        return null;
    }

    public int getInteractIndex() {
        return 0;
    }

    public int getMaximumHealth() {
        return 0;
    }

    public @Nullable String getName() {
        return null;
    }

    public @NotNull List<String> getOptions() {
        return null;
    }

    public String getOverheadText() {
        return null;
    }

    public final @Nullable PathingEntity<?> getTarget() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public final boolean interact(int typeId) {
        return false;
    }

    public final boolean interact(T minimenuAction) {
        return false;
    }

    public boolean isMoving() {
        return false;
    }

    public void setAnimationId(int animationId) {
    }

    public boolean validate() {
        return false;
    }
}