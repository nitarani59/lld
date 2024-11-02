package lld.singleton;

// Method -1 to create singleton class,

public class SingletonThreadSafeEagerInitialization {

    private static SingletonThreadSafeEagerInitialization INSTANCE = new SingletonThreadSafeEagerInitialization();

    private SingletonThreadSafeEagerInitialization() {}

    public static synchronized SingletonThreadSafeEagerInitialization getInstance() {
        return INSTANCE;
    }
}
