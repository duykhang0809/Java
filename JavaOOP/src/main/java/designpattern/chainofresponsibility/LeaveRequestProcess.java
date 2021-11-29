package designpattern.chainofresponsibility;


import designpattern.chainofresponsibility.concretehandler.Director;
import designpattern.chainofresponsibility.concretehandler.Manager;
import designpattern.chainofresponsibility.concretehandler.Supervisor;
import designpattern.chainofresponsibility.handler.Approver;

public class LeaveRequestProcess {

    public static Approver getApprover() {
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();

        supervisor.setNext(manager);
        manager.setNext(director);
        return supervisor;
    }
}
