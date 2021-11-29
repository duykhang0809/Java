package designpattern.observer;

import designpattern.observer.concreteobserver.MessageSubscriber;
import designpattern.observer.concretesubject.MessagePublisher;

public class Notification {

    public static void main(String[] args) {
        MessageSubscriber subscriberOne = new MessageSubscriber("John");
        MessageSubscriber subscriberTwo = new MessageSubscriber("Alex");
        MessageSubscriber subscriberThree = new MessageSubscriber("Dave");


        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(subscriberOne);
        messagePublisher.attach(subscriberTwo);

        messagePublisher.notifyUpdate(new Message("First Message"));   //John and Alex will receive the update

        System.out.println("----");

        messagePublisher.detach(subscriberOne);  //Remove John from List Subscriber
        messagePublisher.attach(subscriberThree);

        messagePublisher.notifyUpdate(new Message("Second Message")); //Alex and Dave will receive the update, John won't
    }
}
