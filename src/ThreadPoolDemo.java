import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    private ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 50,
            30, TimeUnit.MINUTES, new BlockingArrayQueue<>());

}

