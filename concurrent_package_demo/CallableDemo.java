/*
 * unlike Runnable,Callable allows to return something when a threaad is executed.
 * callable interface contains method :
 * public object call()throws Exception{}
 * if we submit callable object to execute after completing the job thread returns the object of the type "future";
 * i.e future object can be used to retrive from callable job.
 */

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.*;

class MyCallable implements Callable<Integer>{
    int num;
    MyCallable(int num){
        this.num=num;
    }
    public Integer call() throws Exception{
        System.out.println("executed by thread :"+ Thread.currentThread().getName());
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }

}
 class CallableDemo{
    public static void main(String[] args) {
        MyCallable[] jobs={
            new MyCallable(90),
            new MyCallable(20),
            new MyCallable(60),
            new MyCallable(50),
            new MyCallable(10)
        };

        ExecutorService service=Executors.newFixedThreadPool(2);
        for(MyCallable job: jobs){
            Future<Integer> f=service.submit(job);
            try{
                System.out.println(f.get());
            }
            catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
        service.shutdown();
    }
 }