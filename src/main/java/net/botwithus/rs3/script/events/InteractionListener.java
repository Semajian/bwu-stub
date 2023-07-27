package net.botwithus.rs3.script.events;

import net.botwithus.rs3.events.impl.InteractionEvent;

public interface InteractionListener {
    public default void accept(InteractionEvent event) {

    }

    public default void onInteraction(InteractionEvent event) {
    }
}