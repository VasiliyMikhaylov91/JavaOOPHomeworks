package Lesson006.Users;

import java.util.HashMap;
import java.util.Map;

public class UserGenerator {
    private Map<Integer, User> userMap = new HashMap<>();
    private Integer count = 0;

    public void addUser(String nickname, String fullName, Gender gender) {
        count++;
        userMap.put(count, new User.Builder(count, nickname).fullName(fullName).gender(gender).build());
    }

    public void addUser(String nickname, String fullName) {
        addUser(nickname, fullName, null);
    }

    public void addUser(String nickname) {
        addUser(nickname,null);
    }

    public User getUser(Integer id) {
        return userMap.get(id);
    }

    public void delUser(Integer id) {
        userMap.remove(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry: userMap.entrySet()) {
            User value = (User) entry.getValue();
            sb.append(String.format("ID: %d nickname: %s fullName: %s gender %s\n",
                    entry.getKey(), value, value.getFullName(), value.getGender()));
        }
        return sb.toString();
    }
}
