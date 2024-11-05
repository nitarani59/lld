package lld.factory.design.pattern;

public class OnCloud implements Source{
    @Override
    public String file() {
        System.out.println("Using onCloud files.");
        return "Using onCloud files.";
    }

    @Override
    public String api() {
        System.out.println("Using onCloud API.");
        return "Using onCloud API.";
    }
}
