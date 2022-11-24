package Lesson001;

import java.util.ArrayList;
import java.util.List;

public class Reserch {
    private Human human;
    private ArrayList<Human> geoTree;
    private ArrayList<Human> result = new ArrayList<>();
    private boolean block = false;

    public Reserch (Human human, ArrayList<Human> geoTree) {
        this.human = human;
        this.geoTree = geoTree;
    }

    public  void getParents(int order, String gender) {
        if (!block) {
            getOrderParents(human, order, gender);
            block = true;
        }
    }

    private void getOrderParents(Human newHuman, int newOrder, String gender) {
        ArrayList<Human> parents = newHuman.getParents();
        if (newOrder == 0) {
            if(gender.equals("all")) {
                result.addAll(parents);
            } else {
                for (Human parent : parents) {
                    if (parent.getGender().equals(gender)) {
                        result.add(parent);
                    }
                }
            }
        }
        for (Human parent: parents) {
            getOrderParents(parent, newOrder - 1, gender);
        }
    }

    public ArrayList<Human> getResult() {
        return result;
    }
}
