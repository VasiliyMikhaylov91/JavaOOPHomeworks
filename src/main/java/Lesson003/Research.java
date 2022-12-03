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
                if (gender.equals("all")) {
                    result.addAll(marrieds);
                } else {
                    for (Human married : marrieds) {
                        if ("male".equals(gender) && married instanceof Man ||
                                "female".equals(gender) && married instanceof Woman) {
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
                        for (Human marriedParent : marriedParents) {
                            if ("male".equals(gender) && marriedParent instanceof Man ||
                                    "female".equals(gender) && marriedParent instanceof Woman) {
                                result.add(marriedParent);
                            }
                        }
                    }
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
            if (gender.equals("all")) {
                result.addAll(children);
            } else {
                for (Human child : children) {
                    if ("male".equals(gender) && child instanceof Man ||
                            "female".equals(gender) && child instanceof Woman) {
                        result.add(child);
                    }
                }
            }
            return;
        }
        for (Human child : children) {
            getOrderChildren(child, newOrder - 1, gender);
        }
    }

    private void getOrderParents(Human newHuman, int newOrder, String gender) {
        ArrayList<Human> parents = newHuman.getParents();
        if (newOrder == 0) {
            if (gender.equals("all")) {
                result.addAll(parents);
            } else {
                for (Human parent : parents) {
                    if ("male".equals(gender) && parent instanceof Man ||
                            "female".equals(gender) && parent instanceof Woman) {
                        result.add(parent);
                    }
                }
            }
            return;
        }
        for (Human parent : parents) {
            getOrderParents(parent, newOrder - 1, gender);
        }
    }

    public ArrayList<Human> getResult() {
        return result;
    }
}
