package lld.ChainOfResponsibility.RequestApproval;

public class SeniorManagerApproval implements RequestApproval{
    RequestApproval requestApproval;

    @Override
    public void execute(Candidate candidate) {
        if (candidate.getSalary() < 2500000) {
            System.out.println("Approved");
        }
        else if (requestApproval != null) {
            System.out.println("Rejected");
            requestApproval.execute(candidate);
        }
        else {
            System.out.println("Rejected");
        }
    }

    @Override
    public void next(RequestApproval requestApproval) {

    }
}
