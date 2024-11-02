package lld.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe INSTANCE = null;

    private SingletonThreadSafe() {}

    public static SingletonThreadSafe getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonThreadSafe();
        }
        return INSTANCE;
    }
}
