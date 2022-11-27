package Lesson002;

import java.util.ArrayList;
import java.util.HashMap;

public class Research {
    private Human human;
    private ArrayList<Human> result = new ArrayList<>();
    private boolean block = false;

    public Research(Human human) {
        this.human = human;
    }

    public  void getParents(int order, String gender) {
        if (!block) {
            getOrderParents(human, order, gender);
            block = true;
        }
    }

    public void getMarrieds(int order, String gender) {
        if (!block) {
            ArrayList<Human> marrieds = human.getMarrieds();
            if (order == 0) {
                if (gender.equals("all")) {
                    result.addAll(marrieds);
                } else {
                    for (Human married : marrieds) {
                        if (married.getGender().equals(gender)) {
                            result.add(married);
                        }
                    }
                }

            } else if (order == 1) {
                for (Human married : marrieds) {
                    ArrayList<Human> marriedParents = married.getParents();
                    if (gender.equals("all")) {
                        result.addAll(marriedParents);
                    } else {
                        for (Human marriedParent: marriedParents) {
                            if (marriedParent.getGender().equals(gender)) {
                                result.add(marriedParent);
                            }
                        }
                    }
                }
            }
        }
    }

    public void getChildren (int order, String gender) {
        if (!block) {
            getOrderChildren(human, order, gender);
            block = true;
        }
    }


    private void getOrderChildren (Human newHuman, int newOrder, String gender) {
        ArrayList<Human> children = newHuman.getChildren();
        if (newOrder == 0) {
            if(gender.equals("all")) {
                result.addAll(children);
            } else {
                for (Human child : children) {
                    if (child.getGender().equals(gender)) {
                        result.add(child);
                    }
                }
            }
            return;
        }
        for (Human child: children) {
            getOrderChildren(child, newOrder - 1, gender);
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
            return;
        }
        for (Human parent: parents) {
            getOrderParents(parent, newOrder - 1, gender);
        }
    }

    public ArrayList<Human> getResult() {
        return result;
    }
}
