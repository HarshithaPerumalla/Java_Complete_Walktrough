/*
 * Executor Framework/Thread Pool- used for performance
 * creating a new thread for every job may create performance problems hence
 * we use thread pool
 * thread pool is a pool for already created threads , ready to do our jobs
 * java-1.5 versions introduced thread pool framework to implement thread pool
 * 
 * creation:
 * ExecutorService service = Executors.NewFixedThreadPool(4);
 * 
 * submitting runnable jobs to thread pool:
 * service.submit(job);
 * 
 * quiting service when job is completed:
 * service.shutdown();
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;
    PrintJob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name+"job started by"+Thread.currentThread().getName());
    
        try{
            Thread.sleep(9);
        }
        catch(InterruptedException e){
            System.out.println("exception caught");
        }
        System.out.println(name+"job completed"+Thread.currentThread().getName());
    }
 }
 class ThreadPoolDemo{
    public static void main(String[] args){
        PrintJob[] jobs={
            new PrintJob("Dhoni"),
            new PrintJob("Virat"),
            new PrintJob("A"),
            new PrintJob("B"),
            new PrintJob("C"),
            new PrintJob("D")};
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
 }
 