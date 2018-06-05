import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {



    public static void main(String args[]){
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 50,
                30, TimeUnit.MINUTES, new BlockingArrayQueue<>());


        executor.submit(()->TestHelper.pringS());
    }

}

class TestHelper{
    public static void pringS(){
        System.out.println("hello1");
        System.out.println("hello2");
    }
}
