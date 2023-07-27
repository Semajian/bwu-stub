package net.botwithus.rs3.game.scene.entities.characters.npc;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.minimenu.actions.NPCAction;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Function;

public class Npc extends Entity {
    public @Nullable Area getArea() {
        return null;
    }

    public @Nullable int getConfigType() {
        return 1;
    }

    public Function<Integer, NPCAction> getDefaultMapper() {
        return null;
    }

    public @NotNull List<String> getOptions() {
        return null;
    }
}