package net.botwithus.rs3.queries;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.stream.Stream;

public class ResultSet<T> {
    public T first() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<T> iterator() {
        return null;
    }

    public T last() {
        return null;
    }

    public @NotNull ResultSet<T> limit(int num) {
        return null;
    }

    public T random() {
        return null;
    }

    public int size() {
        return 0;
    }

    public Stream<T> stream() {
        return null;
    }
}