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
        this.gender = builder.gender;
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
            if (fullName == null) {
                fullName = "Not specified";
            }
            if (gender == null) {
                gender = new Gender(0);
            }
            return new User(this);
        }
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
