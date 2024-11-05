package lld.factory.design.pattern;

public class OnPremise implements Source{
    @Override
    public String file() {
        System.out.println("Using onPremise files.");
        return "Using onPremise files.";
    }

    @Override
    public String api() {
        System.out.println("Using onPremise API.");
        return "Using onPremise API.";
    }
}
