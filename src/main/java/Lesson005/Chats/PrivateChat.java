package Lesson005.Chats;

import Lesson005.Messages.Message;
import Lesson005.Users.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PrivateChat implements Chat {

    private Set<User> users = new HashSet<>();
    private HashMap<Integer, Message> messages = new HashMap();
    private Integer messageCount = 0;

    public PrivateChat(User user1, User user2) {
        users.add(user1);
        users.add(user2);
    }

    @Override
    public void addMessage(Message message) {
        if (users.contains(message.getUser())) messages.put(++messageCount, message);
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

}
