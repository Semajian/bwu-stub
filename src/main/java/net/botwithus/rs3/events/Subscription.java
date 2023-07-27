package net.botwithus.rs3.events;

import net.botwithus.rs3.script.Script;

import java.util.function.Consumer;

public class Subscription<T> {
    public Class<T> getEventType() {
        return null;
    }

    public Consumer<T> getListener() {
        return null;
    }

    public Script getOwner() {
        return null;
    }

    public boolean isGlobal() {
        return false;
    }
}