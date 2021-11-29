package designpattern.chainofresponsibility;

public class LeaveRequestApplication {
    public static void main(String[] args) {

        // Leave request when number of days leave <= 2
        LeaveRequestProcess.getApprover().approveLeaveRequest(new LeaveRequest(2));
        System.out.println("----");
        // Leave request when number of days leave <= 5
        LeaveRequestProcess.getApprover().approveLeaveRequest(new LeaveRequest(5));
        System.out.println("----");
        // Leave request when number of days leave > 5
        LeaveRequestProcess.getApprover().approveLeaveRequest(new LeaveRequest(7));
    }
}
