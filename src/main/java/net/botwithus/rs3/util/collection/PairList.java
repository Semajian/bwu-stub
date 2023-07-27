package net.botwithus.rs3.util.collection;

import java.util.List;

public class PairList<L, R> {
    public void add(L left, R right) {
    }

    public boolean contains(L left, R right) {
        return false;
    }

    public List<L> getLefts() {
        return null;
    }

    public List<L> getLefts(R right) {
        return null;
    }

    public List<R> getRights() {
        return null;
    }

    public List<R> getRights(L left) {
        return null;
    }
}