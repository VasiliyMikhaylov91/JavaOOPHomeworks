package Lesson001;

import java.util.ArrayList;

public class Human {
    private String name;
    private ArrayList<Human> parents = new ArrayList<>();
    private ArrayList<Human> marrieds = new ArrayList<>();
    private ArrayList<Human> children = new ArrayList<>();
    private String gender;

    @Override
    public String toString() {
        return this.name;
    }

    public Human (String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public  ArrayList<Human> getParents() {
        return parents;
    }

    public  ArrayList<Human> getMarrieds() {
        return marrieds;
    }

    public ArrayList<Human> getChildren() { return children; }

    public String getGender() { return gender; }

    public void addParent (Human human) {
        parents.add(human);
        if (!human.getChildren().contains(this)) {
            human.addChild(this);
        }
    }

    public void addMarried (Human human) {
        marrieds.add(human);
        if (!human.getMarrieds().contains(this)) {
            human.addMarried(this);
        }
    }

    public void addChild (Human human) {
        children.add(human);
        if (!human.getParents().contains(this)) {
            human.addParent(this);
        }
    }
}
