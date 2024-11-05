package lld.factory.design.pattern;

public class Main {
    public static void main(String[] args) {
        CreateSourceFactory createSourceFactory = new OnCloudFactory();
        Source source = createSourceFactory.createSource();
        source.api();
    }
}
