package lld.ChainOfResponsibility.RequestApproval;

public class HRApproval implements RequestApproval{
    RequestApproval requestApproval;

    @Override
    public void execute(Candidate candidate) {
        if (candidate.getSalary() < 1500000) {
            System.out.println("Approved");
        }
        else if (requestApproval != null){
            System.out.println("Request transferred to Manger.");
            requestApproval.execute(candidate);
        }
    }

    @Override
    public void next(RequestApproval requestApproval) {
        this.requestApproval = requestApproval;
    }
}
