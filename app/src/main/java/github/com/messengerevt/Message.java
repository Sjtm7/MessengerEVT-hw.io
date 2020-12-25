package github.com.messengerevt;

import java.util.Date;

public class Message {
    public String userName; //имя пользователя
    public String textMessage; //сообщение
    private long messageTime;   // время сообщения

    public Message(){}
    public Message(String userName, String textMessage){
        this.userName = userName;
        this.textMessage = textMessage;

        this.messageTime = new Date().getTime();
    }

    public String getUserName() {
        return userName;
    } //выводит имя пользователя

    public void setUserName(String userName) {  // устанавливает имя пользователя
        this.userName = userName;
    }

    public String getTextMessage() { //выводит текст сообщения
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public long getMessageTime() { //выводит время сообщения
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
