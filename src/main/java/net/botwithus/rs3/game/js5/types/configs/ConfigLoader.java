package net.botwithus.rs3.game.js5.types.configs;

import java.nio.ByteBuffer;

public interface ConfigLoader<T extends ConfigType> {
    public default T decode(int id, ByteBuffer buffer) {
        return null;
    }

    public default T initialize(int id) {
        return null;
    }

    public default void postDecode() {
    }
}