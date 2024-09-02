/*
 * INTER THREAD COMMUNICATION: communication between two or more threads.
 * 
 * notify() and wait(), notifyall()) methods.
 * 
 * wait(), notify(),notify() present in object class.
 * 
 * wait() is invoked by thread which is expecting updation
 * notify() is invoked by thread which is performing updation
 * 
 * If a thread wants to call wait() on any object. then thread must belong to that object only. it only 
 * possible using synchronised area.
 * hence notify(),notifyall(), wait() called in synchronized area.
 * other wise it throws IllegalMonitorStackException.
 * 
 * if thread calls wait() on obj, then it immediatley releases lock of that particular obj , enters into waiting state.
 * but if a thread calls notify()on obj, it may not release the lock immediately.
 * 
 * wait()- waits until the notify(),wait(milliseconds)_waits for only specified
 * 
 * wait() throws interruptedException
 */
class MyThread extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            System.out.println("child got lock and it calculates ");
            for(int i=1;i<=100;i++){
                total=total+i;
            }
            System.out.println("child giving notification");
            this.notify();
        }
        
    }
}

 class InterThreadCommunication{
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 =new MyThread();// we have two threads two threads main and t1
        t1.start();
        //Thread.sleep(1000); //try the code with commenting and uncommeting this
        synchronized(t1){
            System.out.println("main is trying to call wait method");
            t1.wait();
        }
        System.out.println("main thread got notification");
        System.out.println(t1.total);
    
    }
 }
 