package lld.ChainOfResponsibility.RequestApproval;

public interface RequestApproval {
    void execute(Candidate Candidate);
    void next(RequestApproval requestApproval);
}
