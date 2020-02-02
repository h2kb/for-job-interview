package io.github.h2kb.boxesAndBoxes.tank;

public abstract class ParallelepipedTank extends Tank implements ISealed, IHasLid{

    private final int length;

    private final int width;

    private final int height;

    public ParallelepipedTank(int weight, int volume, int liftCapacity, int length, int width, int height) {
        super(weight, volume, liftCapacity);
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
