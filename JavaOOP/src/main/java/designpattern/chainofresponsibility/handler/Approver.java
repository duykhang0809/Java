package designpattern.chainofresponsibility.handler;


import designpattern.chainofresponsibility.LeaveRequest;

public abstract class Approver {

    protected Approver nextApprover;

    public void approveLeaveRequest(LeaveRequest request) {
        System.out.println("Checking permission for " + this.getClass().getSimpleName());
        if (this.canApprove(request.getDays())) {
            this.doApprove(request);
        } else if (nextApprover != null) {
            nextApprover.approveLeaveRequest(request);
        }
    }

    public void setNext(Approver approver) {
        this.nextApprover = approver;
    }

    protected abstract boolean canApprove(int numberOfDays);

    protected abstract void doApprove(LeaveRequest request);
}
