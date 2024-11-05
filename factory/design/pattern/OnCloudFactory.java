package lld.factory.design.pattern;

public class OnCloudFactory implements CreateSourceFactory{
    @Override
    public Source createSource() {
        return new OnCloud();
    }
}
