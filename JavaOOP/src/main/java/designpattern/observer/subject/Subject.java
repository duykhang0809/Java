package designpattern.observer.subject;

import designpattern.observer.Message;
import designpattern.observer.observer.Observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyUpdate(Message message);
}
