package Lesson006.Users;

import Lesson006.Chats.Chat;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer ID;
    private String nickname;
    private String fullName;
    private Gender gender;
    private List<Chat> chats = new ArrayList<>();

    private User(Builder builder) {
        this.ID = builder.ID;
        this.nickname = builder.nickname;
        this.fullName = builder.fullName;
        this.fullName = builder.gender;
    }

    public static class Builder {
        private final Integer ID;
        private final String nickname;

        private String fullName;
        private Gender gender;

        public Builder(Integer ID, String nickname) {
            this.ID = ID;
            this.nickname = nickname;
        }

        public Builder fullName(String val) {
            fullName = val;
            return this;
        }

        public Builder gender(Gender val) {
            gender = val;
            return this;
        }

        public User build() {
            if (fullName = )
        }
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
