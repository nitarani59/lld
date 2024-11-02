package lld.singleton;

// Inner classes in java are loaded in memory by JDK when it comes into scope of usage.
// It means that if we are not performing any action with inner class in our codebase, JDK will not load that inner class into memory.
// It is loaded only when this is being used somewhere.
public class SingletonUsingInnerClass {
    private SingletonUsingInnerClass(){}

    private static class InnerClass {
        private static SingletonUsingInnerClass INSTANCE = new SingletonUsingInnerClass();
    }

    public static SingletonUsingInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}
