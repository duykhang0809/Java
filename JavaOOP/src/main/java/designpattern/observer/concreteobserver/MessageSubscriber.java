package designpattern.observer.concreteobserver;

import designpattern.observer.Message;
import designpattern.observer.observer.Observer;

public class MessageSubscriber implements Observer {
    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println("Subscriber " + name + " :" + message.getMessageContent());
    }
}
