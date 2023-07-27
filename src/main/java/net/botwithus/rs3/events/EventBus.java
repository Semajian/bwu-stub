package net.botwithus.rs3.events;

import net.botwithus.rs3.script.Script;

import java.util.function.Consumer;

public class EventBus {
    public <T> void publish(Script owner, T event) {

    }

    public <T> void publish(T event) {

    }

    public <T> Subscription<T> subscribe(Script owner, Class<T> eventType, Consumer<T> listener) {
        return null;
    }

    public <T> void unsubscribe(Subscription<T> sub) {

    }

    public <T> void unsubscribe(Script owner, Class<T> eventType, Consumer<T> listener) {

    }
}