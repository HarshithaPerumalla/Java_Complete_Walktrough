/*
 * Every Thread in java has some priority. It may be dfault thread priority by jvm. or customised user priority by programmer.
 * Thread priority ranges from 1 to 10
 * Max priority =10
 * Thread Min priority:1
 * Thread normal priority : 5
 * THread class has following methods to get and set priority of a Thread
 * public final int getPriority()
 * public final void setPriority(int p)// p is priority ranges from 1 to 10 only other thanthat exception is thrown
 * the default priority for main thread is 5 and all its child is inherited from its parent.
 */
class MyRunnable implements Runnable{
    public void run(){
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getPriority());
    }
}
class ThreadPriority{
    public static void main(String[] args) {
        MyRunnable r1=new MyRunnable();
        Thread t1= new Thread(r1);
        t1.start();
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("changed priority is "+Thread.currentThread().getPriority());

    }
}