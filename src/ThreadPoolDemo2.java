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

    public static void main(String args[]){
        ThreadPoolDemo2 t = new ThreadPoolDemo2();
        myTask task = t.new myTask();
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            es.submit(()->task);//问题出现在这里！
            es.execute(task);
        }
    }
}
