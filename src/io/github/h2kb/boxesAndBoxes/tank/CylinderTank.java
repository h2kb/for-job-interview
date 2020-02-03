package io.github.h2kb.boxesAndBoxes.tank;

public abstract class CylinderTank extends Tank {

    private final int height;

    private final int radius;

    public CylinderTank(int weight, int liftCapacity, int height, int radius) {
        super(weight, ((int) Math.PI * radius * radius * height), liftCapacity);
        this.height = height;
        this.radius = radius;
    }
}
