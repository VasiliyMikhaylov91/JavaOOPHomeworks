package Lesson001;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Human> geoTree = new HashMap<>();
        geoTree.put(1, new Human("Петр", "male"));
        Output.printHuman(geoTree.get(1));
        geoTree.put(2, new Human("Екатерина", "female"));
        Output.printHuman(geoTree.get(2));
        geoTree.get(1).addMarried(geoTree.get(2));
        System.out.println(" ");
        Output.printGeoTree(geoTree);
        System.out.println(" ");
        Reserch res1 = new Reserch(geoTree.get(1), geoTree);
        res1.getMarrieds(0, "all");
        Output.printHumanList(res1.getResult());
        System.out.println(" ");

        Reserch res2 = new Reserch(geoTree.get(2), geoTree);
        res2.getMarrieds(0, "all");
        Output.printHumanList(res2.getResult());
        System.out.println(" ");

        geoTree.put(3, new Human("Александр", "male"));
        geoTree.get(3).addParent(geoTree.get(1));
        geoTree.get(2).addChild(geoTree.get(3));
        Reserch res3 = new Reserch(geoTree.get(3), geoTree);
        res3.getParents(0, "all");
        Output.printHumanList(res3.getResult());
        System.out.println(" ");

        geoTree.put(4, new Human("Федор", "male"));
        geoTree.put(5, new Human("Галина", "female"));
        geoTree.get(4).addMarried(geoTree.get(5));
        geoTree.put(6, new Human("Елизавета", "female"));
        geoTree.get(6).addParent(geoTree.get(4));
        geoTree.get(6).addParent(geoTree.get(5));
        geoTree.get(6).addMarried(geoTree.get(3));
        geoTree.put(7, new Human("Константин", "male"));
        geoTree.get(7).addParent(geoTree.get(3));
        geoTree.get(7).addParent(geoTree.get(6));
        geoTree.put(8, new Human("Юлия", "female"));
        geoTree.get(8).addParent(geoTree.get(3));
        geoTree.get(8).addParent(geoTree.get(6));
        geoTree.put(9, new Human("Григорий", "male"));
        geoTree.get(9).addParent(geoTree.get(3));
        geoTree.get(9).addParent(geoTree.get(6));
        Reserch res4 = new Reserch(geoTree.get(7), geoTree);
        res4.getParents(1,"all");
        Output.printHumanList(res4.getResult());
        System.out.println(" ");
        Reserch res5 = new Reserch(geoTree.get(1), geoTree);
        res5.getChildren(1, "male");
        Output.printHumanList(res5.getResult());
        System.out.println(" ");

        Reserch res6 = new Reserch(geoTree.get(6), geoTree);
        res6.getMarrieds(1, "female");
        Output.printHumanList(res6.getResult());
    }
}
