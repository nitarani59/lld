package lld.singleton;

// Method -1 to create singleton class,
// disadvantage The main disadvantage of this method is that using synchronized every time while creating the
// singleton object is expensive and may decrease the performance of your program.
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
