package Lesson003;

public class Man extends Human {
    String gender;

    public Man(String name) {
        super(name);
        this.gender = "male";
    }

    @Override
    public String getGender() {
        return gender;
    }
}
