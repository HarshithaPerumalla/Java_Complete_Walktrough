/*
 * Preventing thrad execution temporarily.
 * yield()
 * join()
 * sleep()
 */

/*
 * yield()- 
 * The yield() basically means that the thread is not doing 
 * anything particularly important and if any other threads or processes need to be run, they should run. 
 * Otherwise, the current thread will continue to run.
 * 
 *  whenever the current executing theread encounters yield() method,
 * it pauses and gives chance to  waiting thread that has same priority.
 * if there is no waiting thread or thread has low priority then the current thread continues.
 * 
 * when it handover execution to another thread t2, the current thread goes into waiting state. once t2 is execute scheduling again depends on scheduler.
 * 
 * SOme platforms wont provide proper support for yeild methods coz it has to contact with processor to interrupt.
 */

 /*
 * join() method
 * consider t1 and t2 threads. t2 thread can wait until t1 gets completed .
 * then we go for join() thread.
 * join() method is called in waiting t2. calls t1.jioin()
 as it implements 1st.
  * while a thread waiting . some other thread might interrput. hence we use throws exception
 */

/*
 * sleep()
 * sleep method temporarily stops thread hence there is chnace of 
 * other threads to interrupt hance used throws interrupted exception
 * hence
 * sleep state to ready state 1. either bacuse time is expired or sleep thread is interrupt.
 */

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println(i+"child thread in yield method");
            Thread.yield();
        }
    }
}


class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child thread in join method");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("handled exception");
            }
        }
    }
}


 class ThreadInterrupt{
    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        t1.start();

        MyThread1 t2 =new MyThread1();
        t2.start();
        t2.join();//t2 executes 1st than the main thread.
        for(int i=0;i<10;i++){
            System.out.println(i+"main thread");
        }
    }
}
