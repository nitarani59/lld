package lld.singleton;

// Method -1 to create singleton class,
// If you notice carefully once an object is created synchronization is no longer useful because now obj will not be null
// and any sequence of operations will lead to consistent results.
// So we will only acquire the lock on the getInstance() once when the obj is null
public class SingletonDoubleCheckLocking {

    private static volatile SingletonDoubleCheckLocking INSTANCE = null;

    private SingletonDoubleCheckLocking() {}

    public static synchronized SingletonDoubleCheckLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
