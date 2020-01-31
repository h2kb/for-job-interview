package io.github.h2kb.boxesAndBoxes;

public class MetalBoxSealed extends ParallelepipedContainer {

    public MetalBoxSealed(String name, int length, int width, int height, int weight, int liftCapacity) {
        this.setName(name);
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
        this.setWeight(weight);
        this.setVolumeCapacity(length * width * height);
        this.setLiftCapacity(liftCapacity);
        this.setSealed(true);
    }
}
