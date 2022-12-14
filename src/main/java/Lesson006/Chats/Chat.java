package Lesson006.Chats;

import Lesson006.Messages.Message;

public interface Chat {

    void addMessage(Message message);

    void removeMessage(Integer messageID);

    String getMessages();
}
