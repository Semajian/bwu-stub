package net.botwithus.rs3.script;

import java.util.function.Consumer;

public abstract class Script {
    public final ScriptConfiguration getConfiguration() {
        return null;
    }

    public ScriptConsole getConsole() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public ScriptGraphicsContext getGraphicsContext() {
        return null;
    }

    public final String getName() {
        return null;
    }

    public void initialize() {
    }

    public final boolean isActive() {
        return false;
    }

    public boolean isBackgroundScript() {
        return false;
    }

    public abstract void onLoop();

    public final void print(String message) {

    }

    public final void print(String message, Object... args) {

    }

    public final void println(String message) {
    }

    public final void println(String format, Object... args) {
    }

    public final void setActive(boolean active) {
    }

    public final <T> void subscribe(Class<T> eventType, Consumer<T> listener) {

    }

    public void uninitialize() {
    }
}