package Lesson001;

import java.util.ArrayList;
import java.util.HashMap;

public class Output {
    static void printHuman(Human human) {
        System.out.println(human.getName());
        System.out.println(human.getGender());
    }

    static void printGeoTree(HashMap geoTree) {
        for (Object entry : geoTree.entrySet()) {
            System.out.println(entry);
        }
    }

    static void printHumanList(ArrayList<Human> input) {
        for (Human human : input) {
            System.out.println(human.getName());
        }
    }
}
