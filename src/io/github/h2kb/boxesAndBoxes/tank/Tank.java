package io.github.h2kb.boxesAndBoxes.tank;

import io.github.h2kb.boxesAndBoxes.common.Entity;

import java.util.ArrayList;

public abstract class Tank extends Entity {

    private final int liftCapacity;

    private final int volumeCapacity;

    private ArrayList<Entity> content = new ArrayList<Entity>();

    public Tank(int weight, int volume, int liftCapacity) {
        super(weight, volume);
        this.liftCapacity = liftCapacity;
        this.volumeCapacity = volume;
    }

    protected abstract void putIn(Entity content);

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public int getVolumeCapacity() {
        return volumeCapacity;
    }

    public String showContent() {
        return content.toString();
    }
}
