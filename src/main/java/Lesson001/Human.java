package Lesson001;

import java.util.ArrayList;

public class Human {
    private String name;
    private  ArrayList<Human> parents;
    private  ArrayList<Human> marrieds;
    private String gender;

    public Human (String name, ArrayList<Human> parents,  ArrayList<Human> marrieds, String gender) {
        this.name = name;
        this.parents = parents;
        this.marrieds = marrieds;
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

    public String getGender() {
        return gender;
    }
}
