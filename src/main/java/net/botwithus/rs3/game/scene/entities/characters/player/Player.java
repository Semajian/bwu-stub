package net.botwithus.rs3.game.scene.entities.characters.player;

import net.botwithus.rs3.game.Area;
import net.botwithus.rs3.game.minimenu.actions.PlayerAction;
import net.botwithus.rs3.game.scene.entities.Entity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class Player extends Entity {
    public @Nullable Area getArea() {
        return null;
    }

    public Function<Integer, PlayerAction> getDefaultMapper() {
        return null;
    }
}