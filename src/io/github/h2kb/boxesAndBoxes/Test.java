package io.github.h2kb.boxesAndBoxes;

public class Test {

    public static void main(String[] args) throws Exception {
        Water water = new Water(2, 2);
        Coffee coffee = new Coffee(1, 1);
        PaperBox paperBox = new PaperBox(5, 15, 5, 5, 5);
        MetalBox metalBox = new MetalBox(5, 25, 3, 5, 17);
        System.out.println(paperBox.putIn(coffee));
        System.out.println(paperBox.getVolume());
        System.out.println(paperBox.putIn(metalBox));
        System.out.println(metalBox.getVolume());
        System.out.println(metalBox.getCurrentLoad());
        System.out.println(metalBox.putIn(paperBox));
        System.out.println(metalBox.getCurrentLoad());
        System.out.println(metalBox.putIn(metalBox));
    }

}
