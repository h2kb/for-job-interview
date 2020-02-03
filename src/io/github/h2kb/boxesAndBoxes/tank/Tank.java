package io.github.h2kb.boxesAndBoxes.tank;

import io.github.h2kb.boxesAndBoxes.common.Entity;
import io.github.h2kb.boxesAndBoxes.liquid.ILiquid;

import java.util.ArrayList;
import java.util.Stack;

public abstract class Tank extends Entity {

    private final int liftCapacity;

    private final int volumeCapacity;

    private int currentLoad = 0;

//    protected ArrayList<Entity> contents = new ArrayList<Entity>();
    protected Stack<Entity> contents = new Stack<Entity>();

    public Tank(int weight, int volume, int liftCapacity) {
        super(weight, volume);
        this.liftCapacity = liftCapacity;
        this.volumeCapacity = volume;
    }

    public boolean putIn(Entity content) {
        if (content instanceof ILiquid && !(this instanceof ISealed)) {
            return false;
        }

        if (this != content && currentLoad + content.getWeight() < liftCapacity && content.getVolume() <= volumeCapacity) {
            boolean isResult = doPutIn(content);

            if (isResult) {
                currentLoad += content.getWeight();
            }

            return isResult;
        }

        return false;
    }

    protected abstract boolean doPutIn(Entity content);

    public boolean getOut() {
        if (contents.isEmpty()) {
            return false;
        }

        contents.pop();
        return true;
    }

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
