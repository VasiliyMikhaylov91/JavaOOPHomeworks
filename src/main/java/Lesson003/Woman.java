package Lesson003;

public class Woman extends Human {
    String gender;
    public Woman(String name) {
        super(name);
        this.gender = "male";
    }

    @Override
    public String getGender() {
        return gender;
    }
}
