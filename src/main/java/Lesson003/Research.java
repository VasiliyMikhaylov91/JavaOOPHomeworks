package Lesson003;

import java.util.ArrayList;

public class Research {
    private Human human;
    private ArrayList<Human> result = new ArrayList<>();
    private boolean block = false;

    public Research(Human human) {
        this.human = human;
    }

    public void getParents(int order, String gender) {
        if (!block) {
            getOrderParents(human, order, gender);
            block = true;
        }
    }

    public void getMarrieds(int order, String gender) {
        if (!block) {
            ArrayList<Human> marrieds = human.getMarrieds();
            if (order == 0) {
                selectGender(gender, marrieds);
            } else if (order == 1) {
                for (Human married : marrieds) {
                    ArrayList<Human> marriedParents = married.getParents();
                    selectGender(gender, marriedParents);
                }
            }
        }
    }

    public void getChildren(int order, String gender) {
        if (!block) {
            getOrderChildren(human, order, gender);
            block = true;
        }
    }

    private void getOrderChildren(Human newHuman, int newOrder, String gender) {
        ArrayList<Human> children = newHuman.getChildren();
        if (newOrder == 0) {
            selectGender(gender, children);
            return;
        }
        for (Human child : children) {
            getOrderChildren(child, newOrder - 1, gender);
        }
    }

    private void getOrderParents(Human newHuman, int newOrder, String gender) {
        ArrayList<Human> parents = newHuman.getParents();
        if (newOrder == 0) {
            selectGender(gender, parents);
            return;
        }
        for (Human parent : parents) {
            getOrderParents(parent, newOrder - 1, gender);
        }
    }

    private void selectGender(String gender, ArrayList<Human> humans) {
        if (gender.equals("all")) {
            result.addAll(humans);
        } else {
            for (Human parent : humans) {
                if ("male".equals(gender) && parent instanceof Man ||
                        "female".equals(gender) && parent instanceof Woman) {
                    result.add(parent);
                }
            }
        }
    }

    public ArrayList<Human> getResult() {
        return result;
    }
}
