package Lesson005.Chats;

import Lesson005.Messages.Message;
import Lesson005.Users.User;

import java.util.HashMap;
import java.util.List;

public interface Chat {

    void addMessage(Message message);

    void removeMessage(Integer messageID);

    String getMessages();
}
