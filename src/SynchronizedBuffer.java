import java.util.concurrent.ArrayBlockingQueue;

public class SynchronizedBuffer<T> extends ArrayBlockingQueue<T> {

    private static final int CAPACITY = 10;

    public SynchronizedBuffer() {
        super(CAPACITY);
    }
}
