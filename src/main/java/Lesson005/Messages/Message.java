package Lesson005.Messages;

import Lesson005.Users.User;

public class Message {
    private User user;
    private String text;

    public Message(User user, String text) {
        this.user = user;
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public String getText() {
        return text;
    }
}
