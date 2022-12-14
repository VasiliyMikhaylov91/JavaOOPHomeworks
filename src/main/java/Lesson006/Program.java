package Lesson006;

import Lesson006.Chats.GroupChat;
import Lesson006.Messages.Message;
import Lesson006.Users.UserGenerator;

public class Program {
    public static void main(String[] args) {
        UserGenerator ug = new UserGenerator();
        ug.addUser("Godrick");
        ug.addUser("Silvia");
        ug.addUser("Frank");
        System.out.println(ug);
        GroupChat chat = new GroupChat(ug.getUser(1), false);
        chat.addUser(ug.getUser(2));
        chat.addUser(ug.getUser(3));
        System.out.println(chat.getAdmins());
        System.out.println(chat.getUsers());
        chat.addMessage(new Message(ug.getUser(1), "Hello everybody"));
        chat.addMessage(new Message(ug.getUser(2), "Hello"));
        chat.addMessage(new Message(ug.getUser(3), "Hi"));
        System.out.println(chat.getMessages());
        chat.removeMessage(2);
        System.out.println(chat.getMessages());
    }
}
