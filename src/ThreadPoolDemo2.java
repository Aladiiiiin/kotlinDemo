import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo2 {
    public class myTask implements  Runnable{
        @Override
        public void run(){
            System.out.println(System.currentTimeMillis()+":Thread ID:"+Thread.currentThread().getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public class myNeed{
        public void me(){
            System.out.println("good");
        }
    }

    public static void main(String args[]){
        ThreadPoolDemo2 t = new ThreadPoolDemo2();
        myNeed task = t.new myNeed();
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            es.submit(()->task.me());
//            es.execute(task);
        }
    }
}
