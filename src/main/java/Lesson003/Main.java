package Lesson003;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        GeoTree gt = new GeoTree();
        Output pr = new Output();
        gt.put(new Man("Петр"));
        pr.printHuman(gt.get(1));
        gt.put(new Woman("Екатерина"));
        pr.printHuman(gt.get(2));
        gt.get(1).addMarried(gt.get(2));
        System.out.println(" ");
        pr.printGeoTree((HashMap) gt.getTree());
        System.out.println(" ");
        Research res1 = new Research(gt.get(1));
        res1.getMarrieds(0, "all");
        pr.printHumanList(res1.getResult());
        System.out.println(" ");

        Research res2 = new Research(gt.get(2));
        res2.getMarrieds(0, "all");
        pr.printHumanList(res2.getResult());
        System.out.println(" ");

        gt.put(new Man("Александр"));
        gt.get(3).addParent(gt.get(1));
        gt.get(2).addChild(gt.get(3));
        Research res3 = new Research(gt.get(3));
        res3.getParents(0, "all");
        pr.printHumanList(res3.getResult());
        System.out.println(" ");

        gt.put(new Man("Федор"));
        gt.put(new Woman("Галина"));
        gt.get(4).addMarried(gt.get(5));
        gt.put(new Woman("Елизавета"));
        gt.get(6).addParent(gt.get(4));
        gt.get(6).addParent(gt.get(5));
        gt.get(6).addMarried(gt.get(3));
        gt.put(new Man("Константин"));
        gt.get(7).addParent(gt.get(3));
        gt.get(7).addParent(gt.get(6));
        gt.put(new Woman("Юлия"));
        gt.get(8).addParent(gt.get(3));
        gt.get(8).addParent(gt.get(6));
        gt.put(new Man("Григорий"));
        gt.get(9).addParent(gt.get(3));
        gt.get(9).addParent(gt.get(6));
        Research res4 = new Research(gt.get(7));
        res4.getParents(1,"all");
        pr.printHumanList(res4.getResult());
        System.out.println(" ");
        Research res5 = new Research(gt.get(1));
        res5.getChildren(1, "male");
        pr.printHumanList(res5.getResult());
        System.out.println(" ");

        Research res6 = new Research(gt.get(6));
        res6.getMarrieds(1, "female");
        pr.printHumanList(res6.getResult());
    }
}
