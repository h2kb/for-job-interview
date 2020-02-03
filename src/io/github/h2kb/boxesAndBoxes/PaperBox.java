package io.github.h2kb.boxesAndBoxes;

import io.github.h2kb.boxesAndBoxes.common.Entity;
import io.github.h2kb.boxesAndBoxes.liquid.ILiquid;
import io.github.h2kb.boxesAndBoxes.tank.IHasLid;
import io.github.h2kb.boxesAndBoxes.tank.ParallelepipedTank;

public class PaperBox extends ParallelepipedTank implements IHasLid {

    private boolean isLidClosed = true;

    public PaperBox(int weight, int liftCapacity, int length, int width, int height) {
        super(weight, liftCapacity, length, width, height);
    }

    @Override
    public boolean openLid() {
        isLidClosed = false;
        return isLidClosed;
    }

    @Override
    public boolean closeLid() {
        isLidClosed = true;
        return isLidClosed;
    }

    @Override
    protected boolean doPutIn(Entity content) {
        if (content instanceof ILiquid) {
            return false;
        }

        if (isLidClosed) {
            openLid();
        }

        contents.add(content);
        closeLid();

        return true;
    }
}
