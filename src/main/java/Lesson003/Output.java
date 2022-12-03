package Lesson003;

import java.util.ArrayList;
import java.util.HashMap;

public class Output {
    public void printHuman(Human human) {
        System.out.println(human.getName());
    }

    public void printGeoTree(HashMap geoTree) {
        for (Object entry: geoTree.entrySet()) {
            System.out.println(entry);
        }
    }

    public void printHumanList(ArrayList<Human> input) {
        for (Human human: input) {
            System.out.println(human.getName());
        }
    }
}
