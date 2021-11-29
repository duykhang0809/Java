package designpattern.observer;

public class Message {

    final String messageContent;

    public Message(String message) {
        this.messageContent = message;
    }

    public String getMessageContent() {
        return messageContent;
    }

}
