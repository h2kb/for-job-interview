package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.common.Entity;
import io.github.h2kb.boxesAndBoxes.tank.ISealed;
import io.github.h2kb.boxesAndBoxes.tank.ParallelepipedTank;

public class MetalBox extends ParallelepipedTank implements ISealed {

    public MetalBox(int weight, int liftCapacity, int length, int width, int height) {
        super(weight, liftCapacity, length, width, height);
    }

    @Override
    protected boolean doPutIn(Entity content) {
        contents.add(content);

        return true;
    }
}
