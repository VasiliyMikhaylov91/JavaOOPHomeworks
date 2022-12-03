package Lesson003;

import java.util.HashMap;
import java.util.Map;

public class GeoTree {
    private Map<Integer, Human> geoTree = new HashMap<>();
    private int count = 0;

    public void put(Human newHuman) {
        geoTree.put(++count, newHuman);
    }

    public Human get(int id) {
        return geoTree.get(id);
    }

    public Map<Integer, Human> getTree() {
        return geoTree;
    }
}
