package io.github.h2kb.boxesAndBoxes.tank;

import io.github.h2kb.boxesAndBoxes.common.Entity;

import java.util.ArrayList;

public abstract class Tank extends Entity {

    private final int liftCapacity;

    private final int volumeCapacity;

    private int currentLoad = 0;

    protected ArrayList<Entity> contents = new ArrayList<Entity>();

    public Tank(int weight, int volume, int liftCapacity) {
        super(weight, volume);
        this.liftCapacity = liftCapacity;
        this.volumeCapacity = volume;
    }

    public boolean putIn(Entity content) {
        if (currentLoad + content.getWeight() < liftCapacity && content.getVolume() <= volumeCapacity) {
            boolean result = doPutIn(content);

            if (result == true) {
                currentLoad += content.getWeight();
            }

            return result;
        }

        return false;
    }

    protected abstract boolean doPutIn(Entity content);

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public int getVolumeCapacity() {
        return volumeCapacity;
    }

    public String showContent() {
        return contents.toString();
    }

    public int getCurrentLoad() {
        return currentLoad;
    }
}
