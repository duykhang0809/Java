package designpattern.chainofresponsibility.concretehandler;


import designpattern.chainofresponsibility.LeaveRequest;
import designpattern.chainofresponsibility.handler.Approver;

public class Manager extends Approver {

    @Override
    protected boolean canApprove(int numberOfDays) {
        return numberOfDays <= 5;
    }

    @Override
    protected void doApprove(LeaveRequest request) {
        System.out.println("Leave request approved for " + request.getDays() + " days by Manager");
    }
}
