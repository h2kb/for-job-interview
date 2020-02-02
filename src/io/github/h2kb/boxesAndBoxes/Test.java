package io.github.h2kb.boxesAndBoxes;

public class Test {

    public static void main(String[] args) throws Exception {
        Water water = new Water(2, 2);
        Coffee coffee = new Coffee(1, 1);
//
//        GlassJar glassJar = new GlassJar(5, 2, 7, 10);
//        System.out.println("Lift capacity: " + glassJar.getLiftCapacity());
//        System.out.println("Volume capacity: " + glassJar.getVolumeCapacity());
//        glassJar.putIn(water);
//        glassJar.putIn(coffee);
//        System.out.println("Lift capacity: " + glassJar.getLiftCapacity());
//        System.out.println("Volume capacity: " + glassJar.getVolumeCapacity());
//
//        System.out.println(glassJar.showContent());
//
//        PaperBox paperBox = new PaperBox(5, 5, 10, 5, 50);
//        System.out.println("Lift capacity: " + paperBox.getLiftCapacity());
//        System.out.println("Volume capacity: " + paperBox.getVolumeCapacity());
//        paperBox.putIn(glassJar);
//        System.out.println("Lift capacity: " + paperBox.getLiftCapacity());
//        System.out.println("Volume capacity: " + paperBox.getVolumeCapacity());
//
//        System.out.println(paperBox.showContent());

        System.out.println(water.getWeight());
        System.out.println(water.getVolume());

    }

}
