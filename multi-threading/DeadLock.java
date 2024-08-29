/*
 * DEADLOCK-if two threads are waiting for each other forever 
 * sychronized keyword causes Deadlock.
 * there are no resolution techniques but prevention methods are available
 */

//code to demonstate deadlock situation- try the code with and without removing synchronised keyword on all methods.
class A{
    public synchronized void d1(B b){
        System.out.println("thread1 strat execution of class A.run()");
        try{
            Thread.sleep(300);
        }
        catch(InterruptedException e){
            System.out.println("thread 1 catch block");
        }
        b.last();
        
    }
    public synchronized void last(){
        System.out.println("thread 1 last method");
    }
}
class B{
    public synchronized void d2(A a){
        System.out.println("thread 2 started exefcuting run method of class B");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("thread 2 catch block");
        }
        a.last();

    }
    public synchronized void last(){
        System.out.println("thread 2 last method");
    }
}

class DeadLock extends Thread{
    A a=new A();
    B b=new B();

    public void m1(){
        this.start();
        a.d1(b);//main thread
    }
    @Override
    public void run(){
        b.d2(a);//child thread
    }
    public static void main(String[] args) {
        DeadLock t1=new DeadLock();
        t1.m1();
    }
}

/*
 * STARVATION
 * thread gets the chance of execution after long wait.
 * 
 * example:
 * t1 thread priority:1
 * million threads priority:10
 * t1 only gets chnace to execute when the million threads are executed.
 */