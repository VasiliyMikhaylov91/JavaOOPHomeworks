package Lesson006.Users;

import java.util.HashMap;

public class Gender {
    private String gender;
    private HashMap<Integer, String> genders = new HashMap<>();

    public Gender(Integer genderID) {
        genders.put(0, "None");
        genders.put(1, "Man");
        genders.put(2, "Woman");
        gender = genders.get(genderID);
    }

    @Override
    public String toString() {
        return gender;
    }
}
