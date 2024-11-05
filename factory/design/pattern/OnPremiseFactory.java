package lld.factory.design.pattern;

public class OnPremiseFactory implements CreateSourceFactory{
    @Override
    public Source createSource() {
        return new OnCloud();
    }
}
