package Lesson005.Chats;

import Lesson005.Messages.Message;
import Lesson005.Users.User;

import java.util.HashMap;
import java.util.Map;

public class GroupChat implements Chat {
    private Map<Integer, User> admins = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();
    private Map<Integer, Message> messages = new HashMap<>();
    private boolean isChanel;
    private Integer messageCount = 0;

    public GroupChat(User admin, boolean isChanel) {
        this.isChanel = isChanel;
        admins.put(admin.getID(), admin);
    }

    @Override
    public void addMessage(Message message) {
        if (!isChanel && users.containsValue(message.getUser())
                || admins.containsValue(message.getUser())) {
            messages.put(++messageCount, message);
        }
    }


    @Override
    public void removeMessage(Integer messageID) {
        if (messages.containsKey(messageID)) messages.remove(messageID);
    }

    @Override
    public String getMessages() {
        StringBuilder sb = new StringBuilder();
        for (Message msg: messages.values()) {
            sb.append(String.format("%S: %S\n", msg.getUser(),msg.getText()));
        }
        return sb.toString();
    }


    public void addUser(User user) {
        users.put(user.getID(), user);
    }


    public void removeUser(Integer userID) {
        if (users.containsKey(userID)) users.remove(userID);
        if (admins.containsKey(userID)) admins.remove(userID);
    }

    public void promoteToAdmin(Integer userID) {
        if (users.containsKey(userID)) {
            admins.put(userID, users.get(userID));
            users.remove(userID);
        }
    }

    public String getAdmins() {
        return convertItemToString(admins);
    }

    public String getUsers() {
        return convertItemToString(users);
    }

    private String convertItemToString(Map<Integer, User> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry: map.entrySet()) {
            sb.append(String.format("ID: %d User: %s\n", entry.getKey(), entry.getValue()));
        }
        return sb.toString();
    }
}
