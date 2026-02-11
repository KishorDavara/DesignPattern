package singleton;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    @Serial
    private static final long serialVersionUID = -3271139069771128880L;

    private SerializedSingleton() {}

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * The problem with serialized singleton class is that whenever we deserialize it,
     * it will create a new instance of the class.
     * To overcome this scenario, all we need to do is provide the implementation of readResolve() method.
     */
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}
