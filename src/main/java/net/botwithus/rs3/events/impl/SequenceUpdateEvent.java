package net.botwithus.rs3.events.impl;

import net.botwithus.rs3.game.scene.entities.characters.PathingEntity;

public class SequenceUpdateEvent {

    public int getAnimationId() {
        return 0;
    }

    public PathingEntity<?> getEntity() {
        return null;
    }

    public int getEntityType() {
        return 0;
    }

    public int getServerIndex() {
        return 0;
    }

}