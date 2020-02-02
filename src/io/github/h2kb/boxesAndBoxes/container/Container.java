package io.github.h2kb.boxesAndBoxes.container;

import io.github.h2kb.boxesAndBoxes.common.Entity;

import java.util.ArrayList;

public abstract class Container extends Entity {

    private int liftCapacity;

    private int volumeCapacity;

    private ArrayList<Entity> content = new ArrayList<Entity>();

    private boolean isSealed;

    private boolean hasLid;

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    public void setVolumeCapacity(int volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    public void putIn(Entity content) throws Exception {
//        if (content.isLiquid() && !isSealed()) {
//            throw new Exception("Not sealed.");
//        }

        if (content.getVolume() <= volumeCapacity && content.getWeight() <= liftCapacity) {
            this.content.add(content);
            volumeCapacity -= content.getVolume();
            liftCapacity -= content.getWeight();
            weight += content.getWeight();
        } else {
            throw new Exception("It is full.");
        }
    }

    public void setSealed(boolean sealed) {
        isSealed = sealed;
    }

    public void setHasLid(boolean hasLid) {
        this.hasLid = hasLid;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public int getVolumeCapacity() {
        return volumeCapacity;
    }

    public String showContent() {
        return content.toString();
    }

    public boolean isSealed() {
        return isSealed;
    }

    public boolean isHasLid() {
        return hasLid;
    }
}
