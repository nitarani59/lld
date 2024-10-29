package lld.ChainOfResponsibility.RequestApproval;

public class Main {
    public static void main(String[] args) {
    Candidate candidate = new Candidate("Nita", 25500000);
    RequestApproval requestApproval1 = new HRApproval();
    RequestApproval requestApproval2 = new ManagerApproval();
    RequestApproval requestApproval3 = new SeniorManagerApproval();
    requestApproval1.next(requestApproval2);
    requestApproval2.next(requestApproval3);
    requestApproval1.execute(candidate);
    }
}
