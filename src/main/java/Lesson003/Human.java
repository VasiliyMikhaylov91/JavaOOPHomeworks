package Lesson003;

import java.util.ArrayList;

public abstract class Human {
    String name;
    ArrayList<Human> parents = new ArrayList<>();
    ArrayList<Human> marrieds = new ArrayList<>();
    ArrayList<Human> children = new ArrayList<>();
    String gender;

    @Override
    public String toString() {
        return this.name;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getGender();

    public ArrayList<Human> getParents() {
        return parents;
    }

    public ArrayList<Human> getMarrieds() {
        return marrieds;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public void addParent(Human human) {
        parents.add(human);
        if (!human.getChildren().contains(this)) {
            human.addChild(this);
        }
    }

    public void addMarried(Human human) {
        marrieds.add(human);
        if (!human.getMarrieds().contains(this)) {
            human.addMarried(this);
        }
    }

    public void addChild(Human human) {
        children.add(human);
        if (!human.getParents().contains(this)) {
            human.addParent(this);
        }
    }
}
