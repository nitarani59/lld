package lld.ChainOfResponsibility.RequestApproval;

public class ManagerApproval implements RequestApproval{
    RequestApproval requestApproval;

    @Override
    public void execute(Candidate candidate) {
        if (candidate.getSalary() < 2000000) {
            System.out.println("Approved");
        }
        else if (requestApproval != null) {
            System.out.println("Request transferred to higher manager.");
            requestApproval.execute(candidate);
        }
    }

    @Override
    public void next(RequestApproval requestApproval) {
        this.requestApproval = requestApproval;
    }
}