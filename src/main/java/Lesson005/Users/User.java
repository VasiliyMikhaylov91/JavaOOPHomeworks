package Lesson005.Users;

import Lesson005.Chats.Chat;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer ID;
    private String nickname;
    private String photo;
    private List<Chat> chats = new ArrayList<>();

    public User(Integer ID, String nickname) {
        this.ID = ID;
        this.nickname = nickname;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void addChat(Chat chat) {
        chats.add(chat);
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return nickname;
    }
}
