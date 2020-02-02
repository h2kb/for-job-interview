package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.container.ContainerParallelepiped;

public class MetalBoxSealed extends ContainerParallelepiped {

    public MetalBoxSealed(int length, int width, int height, int weight, int liftCapacity) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
        this.setWeight(weight);
        this.setVolumeCapacity(length * width * height);
        this.setLiftCapacity(liftCapacity);
        this.setSealed(true);
    }
}
