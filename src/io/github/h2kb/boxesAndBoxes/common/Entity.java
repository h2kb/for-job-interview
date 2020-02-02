package io.github.h2kb.boxesAndBoxes.common;

public abstract class Entity {

    protected int weight;

    protected int volume;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolume() {
        return volume;
    }
}
