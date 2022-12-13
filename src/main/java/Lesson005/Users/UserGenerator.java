package Lesson005.Users;

import java.util.HashMap;
import java.util.Map;

public class UserGenerator {
    private Map<Integer, User> userMap = new HashMap<>();
    private Integer count = 0;

    public void addUser(String nickname) {
        count++;
        userMap.put(count, new User(count, nickname));
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
            sb.append(String.format("ID: %d nickname: %s \n", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
